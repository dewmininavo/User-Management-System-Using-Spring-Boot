package com.example.demo.service;
import com.example.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;



import org.modelmapper.TypeToken;

import java.util.List;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUsers() {
      List<User> userList=userRepo.findAll();
      return modelMapper.map(userList, new TypeToken<List<UserDTO>>() {}.getType());

    }
    public UserDTO saveUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;

    }
    public UserDTO updateUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public String deleteUser(UserDTO userDTO) {
        userRepo.delete(modelMapper.map(userDTO, User.class));

  //  public String deleteUser(Integer id) {
     //   userRepo.deleteById(id);
        return "User deleted";
    }

    public UserDTO getUserById(Integer id) {
        User user = userRepo.getUserById(id);
        return modelMapper.map(user, UserDTO.class);

    }

}
