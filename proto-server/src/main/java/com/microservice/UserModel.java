package com.microservice;

import com.connectattoo.PeopleReq;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    public static List<PeopleReq> getPeopleFromDb () {
        List<PeopleReq> people = new ArrayList<>();
        people.add(PeopleReq.newBuilder().setId(1).setName("Davidson").setAge("25").build());
        people.add(PeopleReq.newBuilder().setId(2).setName("Pacifico").setAge("23").build());
        people.add(PeopleReq.newBuilder().setId(3).setName("Barack Obama").setAge("48").build());
        people.add(PeopleReq.newBuilder().setId(4).setName("Donald Trump").setAge("52").build());
        return people;
    }
}
