package com.connectattoo.template;

import com.connectattoo.template.grpc.HelloRequest;
import com.connectattoo.template.grpc.HelloResponse;
import com.connectattoo.template.grpc.SimpleGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
class GreetingsService extends SimpleGrpc.SimpleImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        HelloResponse helloResponse = HelloResponse
                .newBuilder()
                .setMessage("Hello: " + request.getMessage())
                .build();
        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();
    }
}