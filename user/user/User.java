// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: user.proto
// Protobuf Java Version: 4.29.0-rc1

package user;

public final class User {
  private User() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "-rc1",
      User.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UserInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:user.UserInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 userId = 1;</code>
     * @return The userId.
     */
    int getUserId();

    /**
     * <code>string userName = 2;</code>
     * @return The userName.
     */
    java.lang.String getUserName();
    /**
     * <code>string userName = 2;</code>
     * @return The bytes for userName.
     */
    com.google.protobuf.ByteString
        getUserNameBytes();

    /**
     * <code>string userAddress = 3;</code>
     * @return The userAddress.
     */
    java.lang.String getUserAddress();
    /**
     * <code>string userAddress = 3;</code>
     * @return The bytes for userAddress.
     */
    com.google.protobuf.ByteString
        getUserAddressBytes();

    /**
     * <code>string userPhoneNumber = 4;</code>
     * @return The userPhoneNumber.
     */
    java.lang.String getUserPhoneNumber();
    /**
     * <code>string userPhoneNumber = 4;</code>
     * @return The bytes for userPhoneNumber.
     */
    com.google.protobuf.ByteString
        getUserPhoneNumberBytes();
  }
  /**
   * Protobuf type {@code user.UserInfo}
   */
  public static final class UserInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:user.UserInfo)
      UserInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 0,
        /* suffix= */ "-rc1",
        UserInfo.class.getName());
    }
    // Use UserInfo.newBuilder() to construct.
    private UserInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private UserInfo() {
      userName_ = "";
      userAddress_ = "";
      userPhoneNumber_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return user.User.internal_static_user_UserInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return user.User.internal_static_user_UserInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              user.User.UserInfo.class, user.User.UserInfo.Builder.class);
    }

    public static final int USERID_FIELD_NUMBER = 1;
    private int userId_ = 0;
    /**
     * <code>int32 userId = 1;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object userName_ = "";
    /**
     * <code>string userName = 2;</code>
     * @return The userName.
     */
    @java.lang.Override
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      }
    }
    /**
     * <code>string userName = 2;</code>
     * @return The bytes for userName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERADDRESS_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object userAddress_ = "";
    /**
     * <code>string userAddress = 3;</code>
     * @return The userAddress.
     */
    @java.lang.Override
    public java.lang.String getUserAddress() {
      java.lang.Object ref = userAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAddress_ = s;
        return s;
      }
    }
    /**
     * <code>string userAddress = 3;</code>
     * @return The bytes for userAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserAddressBytes() {
      java.lang.Object ref = userAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERPHONENUMBER_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object userPhoneNumber_ = "";
    /**
     * <code>string userPhoneNumber = 4;</code>
     * @return The userPhoneNumber.
     */
    @java.lang.Override
    public java.lang.String getUserPhoneNumber() {
      java.lang.Object ref = userPhoneNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userPhoneNumber_ = s;
        return s;
      }
    }
    /**
     * <code>string userPhoneNumber = 4;</code>
     * @return The bytes for userPhoneNumber.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserPhoneNumberBytes() {
      java.lang.Object ref = userPhoneNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userPhoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (userId_ != 0) {
        output.writeInt32(1, userId_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userName_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, userName_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userAddress_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, userAddress_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userPhoneNumber_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, userPhoneNumber_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, userId_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userName_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, userName_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userAddress_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, userAddress_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userPhoneNumber_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, userPhoneNumber_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof user.User.UserInfo)) {
        return super.equals(obj);
      }
      user.User.UserInfo other = (user.User.UserInfo) obj;

      if (getUserId()
          != other.getUserId()) return false;
      if (!getUserName()
          .equals(other.getUserName())) return false;
      if (!getUserAddress()
          .equals(other.getUserAddress())) return false;
      if (!getUserPhoneNumber()
          .equals(other.getUserPhoneNumber())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUserName().hashCode();
      hash = (37 * hash) + USERADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getUserAddress().hashCode();
      hash = (37 * hash) + USERPHONENUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getUserPhoneNumber().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static user.User.UserInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static user.User.UserInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static user.User.UserInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static user.User.UserInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static user.User.UserInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static user.User.UserInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static user.User.UserInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static user.User.UserInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static user.User.UserInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static user.User.UserInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static user.User.UserInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static user.User.UserInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(user.User.UserInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code user.UserInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:user.UserInfo)
        user.User.UserInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return user.User.internal_static_user_UserInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return user.User.internal_static_user_UserInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                user.User.UserInfo.class, user.User.UserInfo.Builder.class);
      }

      // Construct using user.User.UserInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        userId_ = 0;
        userName_ = "";
        userAddress_ = "";
        userPhoneNumber_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return user.User.internal_static_user_UserInfo_descriptor;
      }

      @java.lang.Override
      public user.User.UserInfo getDefaultInstanceForType() {
        return user.User.UserInfo.getDefaultInstance();
      }

      @java.lang.Override
      public user.User.UserInfo build() {
        user.User.UserInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public user.User.UserInfo buildPartial() {
        user.User.UserInfo result = new user.User.UserInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(user.User.UserInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.userId_ = userId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.userName_ = userName_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.userAddress_ = userAddress_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.userPhoneNumber_ = userPhoneNumber_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof user.User.UserInfo) {
          return mergeFrom((user.User.UserInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(user.User.UserInfo other) {
        if (other == user.User.UserInfo.getDefaultInstance()) return this;
        if (other.getUserId() != 0) {
          setUserId(other.getUserId());
        }
        if (!other.getUserName().isEmpty()) {
          userName_ = other.userName_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getUserAddress().isEmpty()) {
          userAddress_ = other.userAddress_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getUserPhoneNumber().isEmpty()) {
          userPhoneNumber_ = other.userPhoneNumber_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                userId_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                userName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                userAddress_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                userPhoneNumber_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int userId_ ;
      /**
       * <code>int32 userId = 1;</code>
       * @return The userId.
       */
      @java.lang.Override
      public int getUserId() {
        return userId_;
      }
      /**
       * <code>int32 userId = 1;</code>
       * @param value The userId to set.
       * @return This builder for chaining.
       */
      public Builder setUserId(int value) {

        userId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 userId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object userName_ = "";
      /**
       * <code>string userName = 2;</code>
       * @return The userName.
       */
      public java.lang.String getUserName() {
        java.lang.Object ref = userName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string userName = 2;</code>
       * @return The bytes for userName.
       */
      public com.google.protobuf.ByteString
          getUserNameBytes() {
        java.lang.Object ref = userName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string userName = 2;</code>
       * @param value The userName to set.
       * @return This builder for chaining.
       */
      public Builder setUserName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        userName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string userName = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserName() {
        userName_ = getDefaultInstance().getUserName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string userName = 2;</code>
       * @param value The bytes for userName to set.
       * @return This builder for chaining.
       */
      public Builder setUserNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        userName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object userAddress_ = "";
      /**
       * <code>string userAddress = 3;</code>
       * @return The userAddress.
       */
      public java.lang.String getUserAddress() {
        java.lang.Object ref = userAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userAddress_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string userAddress = 3;</code>
       * @return The bytes for userAddress.
       */
      public com.google.protobuf.ByteString
          getUserAddressBytes() {
        java.lang.Object ref = userAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string userAddress = 3;</code>
       * @param value The userAddress to set.
       * @return This builder for chaining.
       */
      public Builder setUserAddress(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        userAddress_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string userAddress = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserAddress() {
        userAddress_ = getDefaultInstance().getUserAddress();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string userAddress = 3;</code>
       * @param value The bytes for userAddress to set.
       * @return This builder for chaining.
       */
      public Builder setUserAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        userAddress_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object userPhoneNumber_ = "";
      /**
       * <code>string userPhoneNumber = 4;</code>
       * @return The userPhoneNumber.
       */
      public java.lang.String getUserPhoneNumber() {
        java.lang.Object ref = userPhoneNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userPhoneNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string userPhoneNumber = 4;</code>
       * @return The bytes for userPhoneNumber.
       */
      public com.google.protobuf.ByteString
          getUserPhoneNumberBytes() {
        java.lang.Object ref = userPhoneNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userPhoneNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string userPhoneNumber = 4;</code>
       * @param value The userPhoneNumber to set.
       * @return This builder for chaining.
       */
      public Builder setUserPhoneNumber(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        userPhoneNumber_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string userPhoneNumber = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserPhoneNumber() {
        userPhoneNumber_ = getDefaultInstance().getUserPhoneNumber();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string userPhoneNumber = 4;</code>
       * @param value The bytes for userPhoneNumber to set.
       * @return This builder for chaining.
       */
      public Builder setUserPhoneNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        userPhoneNumber_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:user.UserInfo)
    }

    // @@protoc_insertion_point(class_scope:user.UserInfo)
    private static final user.User.UserInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new user.User.UserInfo();
    }

    public static user.User.UserInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserInfo>
        PARSER = new com.google.protobuf.AbstractParser<UserInfo>() {
      @java.lang.Override
      public UserInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<UserInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public user.User.UserInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_UserInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_user_UserInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\004user\"Z\n\010UserInfo\022\016\n\006userId" +
      "\030\001 \001(\005\022\020\n\010userName\030\002 \001(\t\022\023\n\013userAddress\030" +
      "\003 \001(\t\022\027\n\017userPhoneNumber\030\004 \001(\tB\007Z\005User/b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_user_UserInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_UserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_user_UserInfo_descriptor,
        new java.lang.String[] { "UserId", "UserName", "UserAddress", "UserPhoneNumber", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
