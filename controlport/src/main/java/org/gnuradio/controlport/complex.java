/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.gnuradio.controlport;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class complex implements org.apache.thrift.TBase<complex, complex._Fields>, java.io.Serializable, Cloneable, Comparable<complex>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("complex");

  private static final org.apache.thrift.protocol.TField RE_FIELD_DESC = new org.apache.thrift.protocol.TField("re", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField IM_FIELD_DESC = new org.apache.thrift.protocol.TField("im", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final SchemeFactory STANDARD_SCHEME_FACTORY = new complexStandardSchemeFactory();
  private static final SchemeFactory TUPLE_SCHEME_FACTORY = new complexTupleSchemeFactory();

  public double re; // required
  public double im; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeDouble(re);
    out.writeDouble(im);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public complex(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.re = in.readDouble();
    this.im = in.readDouble();
  }

  public static final android.os.Parcelable.Creator<complex> CREATOR = new android.os.Parcelable.Creator<complex>() {
    @Override
    public complex[] newArray(int size) {
      return new complex[size];
    }

    @Override
    public complex createFromParcel(android.os.Parcel in) {
      return new complex(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RE((short)1, "re"),
    IM((short)2, "im");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RE
          return RE;
        case 2: // IM
          return IM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __RE_ISSET_ID = 0;
  private static final int __IM_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RE, new org.apache.thrift.meta_data.FieldMetaData("re", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.IM, new org.apache.thrift.meta_data.FieldMetaData("im", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(complex.class, metaDataMap);
  }

  public complex() {
  }

  public complex(
    double re,
    double im)
  {
    this();
    this.re = re;
    setReIsSet(true);
    this.im = im;
    setImIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public complex(complex other) {
    __isset_bitfield = other.__isset_bitfield;
    this.re = other.re;
    this.im = other.im;
  }

  public complex deepCopy() {
    return new complex(this);
  }

  @Override
  public void clear() {
    setReIsSet(false);
    this.re = 0.0;
    setImIsSet(false);
    this.im = 0.0;
  }

  public double getRe() {
    return this.re;
  }

  public complex setRe(double re) {
    this.re = re;
    setReIsSet(true);
    return this;
  }

  public void unsetRe() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RE_ISSET_ID);
  }

  /** Returns true if field re is set (has been assigned a value) and false otherwise */
  public boolean isSetRe() {
    return EncodingUtils.testBit(__isset_bitfield, __RE_ISSET_ID);
  }

  public void setReIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RE_ISSET_ID, value);
  }

  public double getIm() {
    return this.im;
  }

  public complex setIm(double im) {
    this.im = im;
    setImIsSet(true);
    return this;
  }

  public void unsetIm() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IM_ISSET_ID);
  }

  /** Returns true if field im is set (has been assigned a value) and false otherwise */
  public boolean isSetIm() {
    return EncodingUtils.testBit(__isset_bitfield, __IM_ISSET_ID);
  }

  public void setImIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RE:
      if (value == null) {
        unsetRe();
      } else {
        setRe((Double)value);
      }
      break;

    case IM:
      if (value == null) {
        unsetIm();
      } else {
        setIm((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RE:
      return getRe();

    case IM:
      return getIm();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RE:
      return isSetRe();
    case IM:
      return isSetIm();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof complex)
      return this.equals((complex)that);
    return false;
  }

  public boolean equals(complex that) {
    if (that == null)
      return false;

    boolean this_present_re = true;
    boolean that_present_re = true;
    if (this_present_re || that_present_re) {
      if (!(this_present_re && that_present_re))
        return false;
      if (this.re != that.re)
        return false;
    }

    boolean this_present_im = true;
    boolean that_present_im = true;
    if (this_present_im || that_present_im) {
      if (!(this_present_im && that_present_im))
        return false;
      if (this.im != that.im)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_re = true;
    list.add(present_re);
    if (present_re)
      list.add(re);

    boolean present_im = true;
    list.add(present_im);
    if (present_im)
      list.add(im);

    return list.hashCode();
  }

  @Override
  public int compareTo(complex other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRe()).compareTo(other.isSetRe());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRe()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.re, other.re);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIm()).compareTo(other.isSetIm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.im, other.im);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("complex(");
    boolean first = true;

    sb.append("re:");
    sb.append(this.re);
    first = false;
    if (!first) sb.append(", ");
    sb.append("im:");
    sb.append(this.im);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class complexStandardSchemeFactory implements SchemeFactory {
    public complexStandardScheme getScheme() {
      return new complexStandardScheme();
    }
  }

  private static class complexStandardScheme extends StandardScheme<complex> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, complex struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.re = iprot.readDouble();
              struct.setReIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IM
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.im = iprot.readDouble();
              struct.setImIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, complex struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(RE_FIELD_DESC);
      oprot.writeDouble(struct.re);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IM_FIELD_DESC);
      oprot.writeDouble(struct.im);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class complexTupleSchemeFactory implements SchemeFactory {
    public complexTupleScheme getScheme() {
      return new complexTupleScheme();
    }
  }

  private static class complexTupleScheme extends TupleScheme<complex> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, complex struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRe()) {
        optionals.set(0);
      }
      if (struct.isSetIm()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRe()) {
        oprot.writeDouble(struct.re);
      }
      if (struct.isSetIm()) {
        oprot.writeDouble(struct.im);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, complex struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.re = iprot.readDouble();
        struct.setReIsSet(true);
      }
      if (incoming.get(1)) {
        struct.im = iprot.readDouble();
        struct.setImIsSet(true);
      }
    }
  }

  private static <S extends IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
