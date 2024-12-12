package com.connectattoo;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: schema.proto")
public final class PeopleServiceGrpc {

  private PeopleServiceGrpc() {}

  public static final String SERVICE_NAME = "com.connectattoo.PeopleService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.connectattoo.PeopleReq,
      com.connectattoo.PeopleResp> METHOD_GET_PEOPLE =
      io.grpc.MethodDescriptor.<com.connectattoo.PeopleReq, com.connectattoo.PeopleResp>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.connectattoo.PeopleService", "getPeople"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.connectattoo.PeopleReq.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.connectattoo.PeopleResp.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PeopleServiceStub newStub(io.grpc.Channel channel) {
    return new PeopleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PeopleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PeopleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PeopleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PeopleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PeopleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPeople(com.connectattoo.PeopleReq request,
        io.grpc.stub.StreamObserver<com.connectattoo.PeopleResp> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PEOPLE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PEOPLE,
            asyncUnaryCall(
              new MethodHandlers<
                com.connectattoo.PeopleReq,
                com.connectattoo.PeopleResp>(
                  this, METHODID_GET_PEOPLE)))
          .build();
    }
  }

  /**
   */
  public static final class PeopleServiceStub extends io.grpc.stub.AbstractStub<PeopleServiceStub> {
    private PeopleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeopleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeopleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeopleServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPeople(com.connectattoo.PeopleReq request,
        io.grpc.stub.StreamObserver<com.connectattoo.PeopleResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PEOPLE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PeopleServiceBlockingStub extends io.grpc.stub.AbstractStub<PeopleServiceBlockingStub> {
    private PeopleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeopleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeopleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeopleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.connectattoo.PeopleResp getPeople(com.connectattoo.PeopleReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PEOPLE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PeopleServiceFutureStub extends io.grpc.stub.AbstractStub<PeopleServiceFutureStub> {
    private PeopleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeopleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeopleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeopleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.connectattoo.PeopleResp> getPeople(
        com.connectattoo.PeopleReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PEOPLE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PEOPLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PeopleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PeopleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PEOPLE:
          serviceImpl.getPeople((com.connectattoo.PeopleReq) request,
              (io.grpc.stub.StreamObserver<com.connectattoo.PeopleResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class PeopleServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.connectattoo.Schema.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PeopleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PeopleServiceDescriptorSupplier())
              .addMethod(METHOD_GET_PEOPLE)
              .build();
        }
      }
    }
    return result;
  }
}
