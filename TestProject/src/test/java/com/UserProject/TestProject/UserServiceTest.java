package com.UserProject.TestProject;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.UserProject.TestProject.entity.User;
import com.UserProject.TestProject.repository.UserRepository;
import com.UserProject.TestProject.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        when(userRepository.findAll()).thenReturn(List.of(new User()));
        List<User> users = userService.getAllUsers();
        assertEquals(1, users.size());
    }

    @Test
    public void testGetUserById_Found() {
        User user = new User();
        user.setId(1L);
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> foundUser = userService.getUserById(1L);
        assertTrue(foundUser.isPresent());
        assertEquals(1L, foundUser.get().getId());
    }

    @Test
    public void testGetUserById_NotFound() {
        when(userRepository.findById(99L)).thenReturn(Optional.empty());

        Optional<User> foundUser = userService.getUserById(99L);
        assertFalse(foundUser.isPresent());
    }
}
