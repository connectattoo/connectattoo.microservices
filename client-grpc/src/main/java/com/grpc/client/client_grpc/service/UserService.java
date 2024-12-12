package com.grpc.client.client_grpc.service;

import com.connectattoo.PeopleReq;
import com.connectattoo.PeopleResp;
import com.connectattoo.PeopleServiceGrpc;
import com.google.protobuf.Descriptors;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @GrpcClient("grpc-client-service")
    PeopleServiceGrpc.PeopleServiceBlockingStub synchronousCliente;

    public Map<Descriptors.FieldDescriptor, Object> getAuthor (int id) {
        PeopleReq peopleReq = PeopleReq.newBuilder().setId(id).build();
        PeopleResp peopleRes = synchronousCliente.getPeople(peopleReq);
        return peopleRes.getAllFields();
    }
}
