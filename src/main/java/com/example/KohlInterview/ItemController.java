package com.example.KohlInterview;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = {"api/item"})
@Slf4j
public class ItemController {
    private final DbSubstitute dbSubstitute = new DbSubstitute();

    @GetMapping("")
    List<Item> getAllItems(@RequestParam(required = false) String securityId) {
        if(securityId == null){
            return dbSubstitute.getMap().values().stream().collect(Collectors.toList());
        }
        return dbSubstitute.getMap().values().stream().filter(i -> i.getSecurityId().equalsIgnoreCase(securityId))
                .collect(Collectors.toList());
    }

    @GetMapping("/group_by_side/")
    Map<String, List<Item>> getItemsGroupedBySide(){
        return dbSubstitute.getMap().values().stream().collect(Collectors.groupingBy(i-> i.getSide()));
    }

    @PostMapping("/")
    void addItem(@RequestBody Item item) {
        System.out.println("Creating Items with id"+ item.getId());
        dbSubstitute.addItem(item);
    }

}
