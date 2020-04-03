// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conformance.proto

package com.google.javascript.jscomp;

public final class Conformance {
  private Conformance() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jscomp_ConformanceConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jscomp_ConformanceConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jscomp_Requirement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jscomp_Requirement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_jscomp_Requirement_WhitelistEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_jscomp_Requirement_WhitelistEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021conformance.proto\022\006jscomp\"=\n\021Conforman" +
      "ceConfig\022(\n\013requirement\030\001 \003(\0132\023.jscomp.R" +
      "equirement\"\247\n\n\013Requirement\022\025\n\rerror_mess" +
      "age\030\001 \001(\t\022\021\n\twhitelist\030\002 \003(\t\022\030\n\020whitelis" +
      "t_regexp\030\003 \003(\t\022;\n\017whitelist_entry\030\016 \003(\0132" +
      "\".jscomp.Requirement.WhitelistEntry\022\025\n\ro" +
      "nly_apply_to\030\004 \003(\t\022\034\n\024only_apply_to_rege" +
      "xp\030\005 \003(\t\022&\n\004type\030\006 \001(\0162\030.jscomp.Requirem" +
      "ent.Type\022\r\n\005value\030\007 \003(\t\022\035\n\025allow_extendi" +
      "ng_value\030\017 \001(\010\022O\n\026type_matching_strategy" +
      "\030\r \001(\0162(.jscomp.Requirement.TypeMatching" +
      "Strategy:\005LOOSE\022\022\n\njava_class\030\010 \001(\t\022\017\n\007r" +
      "ule_id\030\t \001(\t\022\017\n\007extends\030\n \001(\t\022*\n\034report_" +
      "loose_type_violations\030\013 \001(\010:\004true\0227\n\010sev" +
      "erity\030\014 \001(\0162\034.jscomp.Requirement.Severit" +
      "y:\007WARNING\022\023\n\013config_file\030\020 \003(\t\032\376\001\n\016Whit" +
      "elistEntry\0229\n\006reason\030\001 \001(\0162).jscomp.Requ" +
      "irement.WhitelistEntry.Reason\022\016\n\006prefix\030" +
      "\002 \003(\t\022\016\n\006regexp\030\003 \003(\t\022\023\n\013explanation\030\004 \001" +
      "(\t\022\017\n\007comment\030\005 \003(\t\022\033\n\023automatically_pru" +
      "ne\030\006 \001(\010\"N\n\006Reason\022\017\n\013UNSPECIFIED\020\000\022\n\n\006L" +
      "EGACY\020\001\022\020\n\014OUT_OF_SCOPE\020\002\022\025\n\021MANUALLY_RE" +
      "VIEWED\020\003\"\347\002\n\004Type\022\n\n\006CUSTOM\020\001\022\025\n\021BANNED_" +
      "DEPENDENCY\020\002\022\033\n\027BANNED_DEPENDENCY_REGEX\020" +
      "\016\022\017\n\013BANNED_NAME\020\003\022\023\n\017BANNED_PROPERTY\020\004\022" +
      "\030\n\024BANNED_PROPERTY_READ\020\005\022\031\n\025BANNED_PROP" +
      "ERTY_WRITE\020\006\022\030\n\024RESTRICTED_NAME_CALL\020\007\022\032" +
      "\n\026RESTRICTED_METHOD_CALL\020\010\022\027\n\023BANNED_COD" +
      "E_PATTERN\020\t\022\030\n\024BANNED_PROPERTY_CALL\020\n\022&\n" +
      "\"BANNED_PROPERTY_NON_CONSTANT_WRITE\020\013\022\024\n" +
      "\020BANNED_NAME_CALL\020\014\022\035\n\031RESTRICTED_PROPER" +
      "TY_WRITE\020\r\"_\n\024TypeMatchingStrategy\022\013\n\007UN" +
      "KNOWN\020\000\022\t\n\005LOOSE\020\001\022\026\n\022STRICT_NULLABILITY" +
      "\020\002\022\014\n\010SUBTYPES\020\003\022\t\n\005EXACT\020\004\"3\n\010Severity\022" +
      "\017\n\013UNSPECIFIED\020\000\022\013\n\007WARNING\020\001\022\t\n\005ERROR\020\002" +
      "*\n\010\300\204=\020\200\200\200\200\002B \n\034com.google.javascript.js" +
      "compP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_jscomp_ConformanceConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_jscomp_ConformanceConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jscomp_ConformanceConfig_descriptor,
        new java.lang.String[] { "Requirement", });
    internal_static_jscomp_Requirement_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_jscomp_Requirement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jscomp_Requirement_descriptor,
        new java.lang.String[] { "ErrorMessage", "Whitelist", "WhitelistRegexp", "WhitelistEntry", "OnlyApplyTo", "OnlyApplyToRegexp", "Type", "Value", "AllowExtendingValue", "TypeMatchingStrategy", "JavaClass", "RuleId", "Extends", "ReportLooseTypeViolations", "Severity", "ConfigFile", });
    internal_static_jscomp_Requirement_WhitelistEntry_descriptor =
      internal_static_jscomp_Requirement_descriptor.getNestedTypes().get(0);
    internal_static_jscomp_Requirement_WhitelistEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_jscomp_Requirement_WhitelistEntry_descriptor,
        new java.lang.String[] { "Reason", "Prefix", "Regexp", "Explanation", "Comment", "AutomaticallyPrune", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
