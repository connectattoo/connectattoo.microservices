// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package com.connectattoo;

public final class Schema {
  private Schema() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_connectattoo_PeopleReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_connectattoo_PeopleReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_connectattoo_PeopleResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_connectattoo_PeopleResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014schema.proto\022\020com.connectattoo\"2\n\tPeop" +
      "leReq\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\013\n\003age\030\003" +
      " \001(\t\"\'\n\nPeopleResp\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030" +
      "\002 \001(\t2W\n\rPeopleService\022F\n\tgetPeople\022\033.co" +
      "m.connectattoo.PeopleReq\032\034.com.connectat" +
      "too.PeopleRespB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_connectattoo_PeopleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_connectattoo_PeopleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_connectattoo_PeopleReq_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", });
    internal_static_com_connectattoo_PeopleResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_connectattoo_PeopleResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_connectattoo_PeopleResp_descriptor,
        new java.lang.String[] { "Name", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
