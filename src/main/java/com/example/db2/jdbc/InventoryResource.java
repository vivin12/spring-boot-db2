package com.example.db2.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@RestController
public class InventoryResource {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> example() {
        List<String> list = new ArrayList<>();
        list.add("Table data...");
        jdbcTemplate.update("INSERT INTO APP.INVENTORY(INVENTORYID, CATEGORY, COST, DESCRIPTION, HEADING, IMAGE, IMGBYTES, ISPUBLIC, MAXTHRESHOLD, MINTHRESHOLD, NAME, NOTES, PKGINFO, PRICE, QUANTITY) VALUES ('F0001', 0, 145.0, 'African orchids are some of the most endangered and rare kinds of orchids grown today. This variety is medium yellow with varigated salmon and pink insides. Height: 18 to 28 inches.', 'Rare Delicate Beauty', 'flower_african_orchid.jpg',null, 1, 200, 50, 'African Orchid', 'NOTES and stuff', 'per plant', 250.0, 99)");

        return new ResponseEntity<String>(list.toString(), HttpStatus.OK);
    }
}