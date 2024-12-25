package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//lambok wlin gnn annotation ekak.data ekk ganudenu krddi datahandling wlta support krnw
@NoArgsConstructor //arguments nthuw plain constructer ekk hdla denw
@AllArgsConstructor //eka argument ekak ekka constructor ekk hdnw class eke hama property ekktama adalawa
public class UserDTO {
    private int id;
    private String name;

//class ekt properties intialize krna structure eka
}
