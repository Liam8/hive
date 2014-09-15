/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.serde2.thrift.test;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

public class PropValueUnion extends org.apache.thrift.TUnion<PropValueUnion, PropValueUnion._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PropValueUnion");
  private static final org.apache.thrift.protocol.TField INT_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("intValue", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LONG_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("longValue", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField STRING_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("stringValue", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DOUBLE_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("doubleValue", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("flag", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField L_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("lString", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField UNION_MSTRING_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("unionMStringString", org.apache.thrift.protocol.TType.MAP, (short)7);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INT_VALUE((short)1, "intValue"),
    LONG_VALUE((short)2, "longValue"),
    STRING_VALUE((short)3, "stringValue"),
    DOUBLE_VALUE((short)4, "doubleValue"),
    FLAG((short)5, "flag"),
    L_STRING((short)6, "lString"),
    UNION_MSTRING_STRING((short)7, "unionMStringString");

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
        case 1: // INT_VALUE
          return INT_VALUE;
        case 2: // LONG_VALUE
          return LONG_VALUE;
        case 3: // STRING_VALUE
          return STRING_VALUE;
        case 4: // DOUBLE_VALUE
          return DOUBLE_VALUE;
        case 5: // FLAG
          return FLAG;
        case 6: // L_STRING
          return L_STRING;
        case 7: // UNION_MSTRING_STRING
          return UNION_MSTRING_STRING;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INT_VALUE, new org.apache.thrift.meta_data.FieldMetaData("intValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LONG_VALUE, new org.apache.thrift.meta_data.FieldMetaData("longValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STRING_VALUE, new org.apache.thrift.meta_data.FieldMetaData("stringValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DOUBLE_VALUE, new org.apache.thrift.meta_data.FieldMetaData("doubleValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.FLAG, new org.apache.thrift.meta_data.FieldMetaData("flag", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.L_STRING, new org.apache.thrift.meta_data.FieldMetaData("lString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.UNION_MSTRING_STRING, new org.apache.thrift.meta_data.FieldMetaData("unionMStringString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PropValueUnion.class, metaDataMap);
  }

  public PropValueUnion() {
    super();
  }

  public PropValueUnion(_Fields setField, Object value) {
    super(setField, value);
  }

  public PropValueUnion(PropValueUnion other) {
    super(other);
  }
  public PropValueUnion deepCopy() {
    return new PropValueUnion(this);
  }

  public static PropValueUnion intValue(int value) {
    PropValueUnion x = new PropValueUnion();
    x.setIntValue(value);
    return x;
  }

  public static PropValueUnion longValue(long value) {
    PropValueUnion x = new PropValueUnion();
    x.setLongValue(value);
    return x;
  }

  public static PropValueUnion stringValue(String value) {
    PropValueUnion x = new PropValueUnion();
    x.setStringValue(value);
    return x;
  }

  public static PropValueUnion doubleValue(double value) {
    PropValueUnion x = new PropValueUnion();
    x.setDoubleValue(value);
    return x;
  }

  public static PropValueUnion flag(boolean value) {
    PropValueUnion x = new PropValueUnion();
    x.setFlag(value);
    return x;
  }

  public static PropValueUnion lString(List<String> value) {
    PropValueUnion x = new PropValueUnion();
    x.setLString(value);
    return x;
  }

  public static PropValueUnion unionMStringString(Map<String,String> value) {
    PropValueUnion x = new PropValueUnion();
    x.setUnionMStringString(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case INT_VALUE:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'intValue', but got " + value.getClass().getSimpleName());
      case LONG_VALUE:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'longValue', but got " + value.getClass().getSimpleName());
      case STRING_VALUE:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'stringValue', but got " + value.getClass().getSimpleName());
      case DOUBLE_VALUE:
        if (value instanceof Double) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Double for field 'doubleValue', but got " + value.getClass().getSimpleName());
      case FLAG:
        if (value instanceof Boolean) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Boolean for field 'flag', but got " + value.getClass().getSimpleName());
      case L_STRING:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<String> for field 'lString', but got " + value.getClass().getSimpleName());
      case UNION_MSTRING_STRING:
        if (value instanceof Map) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Map<String,String> for field 'unionMStringString', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case INT_VALUE:
          if (field.type == INT_VALUE_FIELD_DESC.type) {
            Integer intValue;
            intValue = iprot.readI32();
            return intValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LONG_VALUE:
          if (field.type == LONG_VALUE_FIELD_DESC.type) {
            Long longValue;
            longValue = iprot.readI64();
            return longValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STRING_VALUE:
          if (field.type == STRING_VALUE_FIELD_DESC.type) {
            String stringValue;
            stringValue = iprot.readString();
            return stringValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLE_VALUE:
          if (field.type == DOUBLE_VALUE_FIELD_DESC.type) {
            Double doubleValue;
            doubleValue = iprot.readDouble();
            return doubleValue;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FLAG:
          if (field.type == FLAG_FIELD_DESC.type) {
            Boolean flag;
            flag = iprot.readBool();
            return flag;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case L_STRING:
          if (field.type == L_STRING_FIELD_DESC.type) {
            List<String> lString;
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              lString = new ArrayList<String>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                String _elem2; // required
                _elem2 = iprot.readString();
                lString.add(_elem2);
              }
              iprot.readListEnd();
            }
            return lString;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case UNION_MSTRING_STRING:
          if (field.type == UNION_MSTRING_STRING_FIELD_DESC.type) {
            Map<String,String> unionMStringString;
            {
              org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
              unionMStringString = new HashMap<String,String>(2*_map3.size);
              for (int _i4 = 0; _i4 < _map3.size; ++_i4)
              {
                String _key5; // required
                String _val6; // optional
                _key5 = iprot.readString();
                _val6 = iprot.readString();
                unionMStringString.put(_key5, _val6);
              }
              iprot.readMapEnd();
            }
            return unionMStringString;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case INT_VALUE:
        Integer intValue = (Integer)value_;
        oprot.writeI32(intValue);
        return;
      case LONG_VALUE:
        Long longValue = (Long)value_;
        oprot.writeI64(longValue);
        return;
      case STRING_VALUE:
        String stringValue = (String)value_;
        oprot.writeString(stringValue);
        return;
      case DOUBLE_VALUE:
        Double doubleValue = (Double)value_;
        oprot.writeDouble(doubleValue);
        return;
      case FLAG:
        Boolean flag = (Boolean)value_;
        oprot.writeBool(flag);
        return;
      case L_STRING:
        List<String> lString = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, lString.size()));
          for (String _iter7 : lString)
          {
            oprot.writeString(_iter7);
          }
          oprot.writeListEnd();
        }
        return;
      case UNION_MSTRING_STRING:
        Map<String,String> unionMStringString = (Map<String,String>)value_;
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, unionMStringString.size()));
          for (Map.Entry<String, String> _iter8 : unionMStringString.entrySet())
          {
            oprot.writeString(_iter8.getKey());
            oprot.writeString(_iter8.getValue());
          }
          oprot.writeMapEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case INT_VALUE:
          Integer intValue;
          intValue = iprot.readI32();
          return intValue;
        case LONG_VALUE:
          Long longValue;
          longValue = iprot.readI64();
          return longValue;
        case STRING_VALUE:
          String stringValue;
          stringValue = iprot.readString();
          return stringValue;
        case DOUBLE_VALUE:
          Double doubleValue;
          doubleValue = iprot.readDouble();
          return doubleValue;
        case FLAG:
          Boolean flag;
          flag = iprot.readBool();
          return flag;
        case L_STRING:
          List<String> lString;
          {
            org.apache.thrift.protocol.TList _list9 = iprot.readListBegin();
            lString = new ArrayList<String>(_list9.size);
            for (int _i10 = 0; _i10 < _list9.size; ++_i10)
            {
              String _elem11; // required
              _elem11 = iprot.readString();
              lString.add(_elem11);
            }
            iprot.readListEnd();
          }
          return lString;
        case UNION_MSTRING_STRING:
          Map<String,String> unionMStringString;
          {
            org.apache.thrift.protocol.TMap _map12 = iprot.readMapBegin();
            unionMStringString = new HashMap<String,String>(2*_map12.size);
            for (int _i13 = 0; _i13 < _map12.size; ++_i13)
            {
              String _key14; // required
              String _val15; // optional
              _key14 = iprot.readString();
              _val15 = iprot.readString();
              unionMStringString.put(_key14, _val15);
            }
            iprot.readMapEnd();
          }
          return unionMStringString;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case INT_VALUE:
        Integer intValue = (Integer)value_;
        oprot.writeI32(intValue);
        return;
      case LONG_VALUE:
        Long longValue = (Long)value_;
        oprot.writeI64(longValue);
        return;
      case STRING_VALUE:
        String stringValue = (String)value_;
        oprot.writeString(stringValue);
        return;
      case DOUBLE_VALUE:
        Double doubleValue = (Double)value_;
        oprot.writeDouble(doubleValue);
        return;
      case FLAG:
        Boolean flag = (Boolean)value_;
        oprot.writeBool(flag);
        return;
      case L_STRING:
        List<String> lString = (List<String>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, lString.size()));
          for (String _iter16 : lString)
          {
            oprot.writeString(_iter16);
          }
          oprot.writeListEnd();
        }
        return;
      case UNION_MSTRING_STRING:
        Map<String,String> unionMStringString = (Map<String,String>)value_;
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, unionMStringString.size()));
          for (Map.Entry<String, String> _iter17 : unionMStringString.entrySet())
          {
            oprot.writeString(_iter17.getKey());
            oprot.writeString(_iter17.getValue());
          }
          oprot.writeMapEnd();
        }
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case INT_VALUE:
        return INT_VALUE_FIELD_DESC;
      case LONG_VALUE:
        return LONG_VALUE_FIELD_DESC;
      case STRING_VALUE:
        return STRING_VALUE_FIELD_DESC;
      case DOUBLE_VALUE:
        return DOUBLE_VALUE_FIELD_DESC;
      case FLAG:
        return FLAG_FIELD_DESC;
      case L_STRING:
        return L_STRING_FIELD_DESC;
      case UNION_MSTRING_STRING:
        return UNION_MSTRING_STRING_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public int getIntValue() {
    if (getSetField() == _Fields.INT_VALUE) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'intValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setIntValue(int value) {
    setField_ = _Fields.INT_VALUE;
    value_ = value;
  }

  public long getLongValue() {
    if (getSetField() == _Fields.LONG_VALUE) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'longValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLongValue(long value) {
    setField_ = _Fields.LONG_VALUE;
    value_ = value;
  }

  public String getStringValue() {
    if (getSetField() == _Fields.STRING_VALUE) {
      return (String)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stringValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStringValue(String value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STRING_VALUE;
    value_ = value;
  }

  public double getDoubleValue() {
    if (getSetField() == _Fields.DOUBLE_VALUE) {
      return (Double)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'doubleValue' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDoubleValue(double value) {
    setField_ = _Fields.DOUBLE_VALUE;
    value_ = value;
  }

  public boolean getFlag() {
    if (getSetField() == _Fields.FLAG) {
      return (Boolean)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'flag' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFlag(boolean value) {
    setField_ = _Fields.FLAG;
    value_ = value;
  }

  public List<String> getLString() {
    if (getSetField() == _Fields.L_STRING) {
      return (List<String>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'lString' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLString(List<String> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.L_STRING;
    value_ = value;
  }

  public Map<String,String> getUnionMStringString() {
    if (getSetField() == _Fields.UNION_MSTRING_STRING) {
      return (Map<String,String>)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'unionMStringString' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUnionMStringString(Map<String,String> value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.UNION_MSTRING_STRING;
    value_ = value;
  }

  public boolean isSetIntValue() {
    return setField_ == _Fields.INT_VALUE;
  }


  public boolean isSetLongValue() {
    return setField_ == _Fields.LONG_VALUE;
  }


  public boolean isSetStringValue() {
    return setField_ == _Fields.STRING_VALUE;
  }


  public boolean isSetDoubleValue() {
    return setField_ == _Fields.DOUBLE_VALUE;
  }


  public boolean isSetFlag() {
    return setField_ == _Fields.FLAG;
  }


  public boolean isSetLString() {
    return setField_ == _Fields.L_STRING;
  }


  public boolean isSetUnionMStringString() {
    return setField_ == _Fields.UNION_MSTRING_STRING;
  }


  public boolean equals(Object other) {
    if (other instanceof PropValueUnion) {
      return equals((PropValueUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(PropValueUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(PropValueUnion other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    HashCodeBuilder hcb = new HashCodeBuilder();
    hcb.append(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      hcb.append(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        hcb.append(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        hcb.append(value);
      }
    }
    return hcb.toHashCode();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
