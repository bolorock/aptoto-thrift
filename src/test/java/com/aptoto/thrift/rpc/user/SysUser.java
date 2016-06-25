/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.aptoto.thrift.rpc.user;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-13")
public class SysUser implements org.apache.thrift.TBase<SysUser, SysUser._Fields>, java.io.Serializable, Cloneable, Comparable<SysUser> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SysUser");

  private static final org.apache.thrift.protocol.TField PID_FIELD_DESC = new org.apache.thrift.protocol.TField("pid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MEMBER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("memberId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DEPARTMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("department", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField JOB_TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobTitle", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("mail", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PWD_FIELD_DESC = new org.apache.thrift.protocol.TField("pwd", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField PHOTO_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("photoUrl", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SysUserStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SysUserTupleSchemeFactory());
  }

  public int pid; // required
  public String userName; // required
  public String memberId; // required
  public String department; // required
  public String jobTitle; // required
  public String mail; // required
  public String pwd; // required
  public String photoUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PID((short)1, "pid"),
    USER_NAME((short)2, "userName"),
    MEMBER_ID((short)3, "memberId"),
    DEPARTMENT((short)4, "department"),
    JOB_TITLE((short)5, "jobTitle"),
    MAIL((short)6, "mail"),
    PWD((short)7, "pwd"),
    PHOTO_URL((short)8, "photoUrl");

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
        case 1: // PID
          return PID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // MEMBER_ID
          return MEMBER_ID;
        case 4: // DEPARTMENT
          return DEPARTMENT;
        case 5: // JOB_TITLE
          return JOB_TITLE;
        case 6: // MAIL
          return MAIL;
        case 7: // PWD
          return PWD;
        case 8: // PHOTO_URL
          return PHOTO_URL;
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
  private static final int __PID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PID, new org.apache.thrift.meta_data.FieldMetaData("pid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MEMBER_ID, new org.apache.thrift.meta_data.FieldMetaData("memberId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEPARTMENT, new org.apache.thrift.meta_data.FieldMetaData("department", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.JOB_TITLE, new org.apache.thrift.meta_data.FieldMetaData("jobTitle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAIL, new org.apache.thrift.meta_data.FieldMetaData("mail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PWD, new org.apache.thrift.meta_data.FieldMetaData("pwd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHOTO_URL, new org.apache.thrift.meta_data.FieldMetaData("photoUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SysUser.class, metaDataMap);
  }

  public SysUser() {
  }

  public SysUser(
    int pid,
    String userName,
    String memberId,
    String department,
    String jobTitle,
    String mail,
    String pwd,
    String photoUrl)
  {
    this();
    this.pid = pid;
    setPidIsSet(true);
    this.userName = userName;
    this.memberId = memberId;
    this.department = department;
    this.jobTitle = jobTitle;
    this.mail = mail;
    this.pwd = pwd;
    this.photoUrl = photoUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SysUser(SysUser other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pid = other.pid;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetMemberId()) {
      this.memberId = other.memberId;
    }
    if (other.isSetDepartment()) {
      this.department = other.department;
    }
    if (other.isSetJobTitle()) {
      this.jobTitle = other.jobTitle;
    }
    if (other.isSetMail()) {
      this.mail = other.mail;
    }
    if (other.isSetPwd()) {
      this.pwd = other.pwd;
    }
    if (other.isSetPhotoUrl()) {
      this.photoUrl = other.photoUrl;
    }
  }

  public SysUser deepCopy() {
    return new SysUser(this);
  }

  @Override
  public void clear() {
    setPidIsSet(false);
    this.pid = 0;
    this.userName = null;
    this.memberId = null;
    this.department = null;
    this.jobTitle = null;
    this.mail = null;
    this.pwd = null;
    this.photoUrl = null;
  }

  public int getPid() {
    return this.pid;
  }

  public SysUser setPid(int pid) {
    this.pid = pid;
    setPidIsSet(true);
    return this;
  }

  public void unsetPid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PID_ISSET_ID);
  }

  /** Returns true if field pid is set (has been assigned a value) and false otherwise */
  public boolean isSetPid() {
    return EncodingUtils.testBit(__isset_bitfield, __PID_ISSET_ID);
  }

  public void setPidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PID_ISSET_ID, value);
  }

  public String getUserName() {
    return this.userName;
  }

  public SysUser setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public String getMemberId() {
    return this.memberId;
  }

  public SysUser setMemberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  public void unsetMemberId() {
    this.memberId = null;
  }

  /** Returns true if field memberId is set (has been assigned a value) and false otherwise */
  public boolean isSetMemberId() {
    return this.memberId != null;
  }

  public void setMemberIdIsSet(boolean value) {
    if (!value) {
      this.memberId = null;
    }
  }

  public String getDepartment() {
    return this.department;
  }

  public SysUser setDepartment(String department) {
    this.department = department;
    return this;
  }

  public void unsetDepartment() {
    this.department = null;
  }

  /** Returns true if field department is set (has been assigned a value) and false otherwise */
  public boolean isSetDepartment() {
    return this.department != null;
  }

  public void setDepartmentIsSet(boolean value) {
    if (!value) {
      this.department = null;
    }
  }

  public String getJobTitle() {
    return this.jobTitle;
  }

  public SysUser setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  public void unsetJobTitle() {
    this.jobTitle = null;
  }

  /** Returns true if field jobTitle is set (has been assigned a value) and false otherwise */
  public boolean isSetJobTitle() {
    return this.jobTitle != null;
  }

  public void setJobTitleIsSet(boolean value) {
    if (!value) {
      this.jobTitle = null;
    }
  }

  public String getMail() {
    return this.mail;
  }

  public SysUser setMail(String mail) {
    this.mail = mail;
    return this;
  }

  public void unsetMail() {
    this.mail = null;
  }

  /** Returns true if field mail is set (has been assigned a value) and false otherwise */
  public boolean isSetMail() {
    return this.mail != null;
  }

  public void setMailIsSet(boolean value) {
    if (!value) {
      this.mail = null;
    }
  }

  public String getPwd() {
    return this.pwd;
  }

  public SysUser setPwd(String pwd) {
    this.pwd = pwd;
    return this;
  }

  public void unsetPwd() {
    this.pwd = null;
  }

  /** Returns true if field pwd is set (has been assigned a value) and false otherwise */
  public boolean isSetPwd() {
    return this.pwd != null;
  }

  public void setPwdIsSet(boolean value) {
    if (!value) {
      this.pwd = null;
    }
  }

  public String getPhotoUrl() {
    return this.photoUrl;
  }

  public SysUser setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

  public void unsetPhotoUrl() {
    this.photoUrl = null;
  }

  /** Returns true if field photoUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetPhotoUrl() {
    return this.photoUrl != null;
  }

  public void setPhotoUrlIsSet(boolean value) {
    if (!value) {
      this.photoUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PID:
      if (value == null) {
        unsetPid();
      } else {
        setPid((Integer)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case MEMBER_ID:
      if (value == null) {
        unsetMemberId();
      } else {
        setMemberId((String)value);
      }
      break;

    case DEPARTMENT:
      if (value == null) {
        unsetDepartment();
      } else {
        setDepartment((String)value);
      }
      break;

    case JOB_TITLE:
      if (value == null) {
        unsetJobTitle();
      } else {
        setJobTitle((String)value);
      }
      break;

    case MAIL:
      if (value == null) {
        unsetMail();
      } else {
        setMail((String)value);
      }
      break;

    case PWD:
      if (value == null) {
        unsetPwd();
      } else {
        setPwd((String)value);
      }
      break;

    case PHOTO_URL:
      if (value == null) {
        unsetPhotoUrl();
      } else {
        setPhotoUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PID:
      return Integer.valueOf(getPid());

    case USER_NAME:
      return getUserName();

    case MEMBER_ID:
      return getMemberId();

    case DEPARTMENT:
      return getDepartment();

    case JOB_TITLE:
      return getJobTitle();

    case MAIL:
      return getMail();

    case PWD:
      return getPwd();

    case PHOTO_URL:
      return getPhotoUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PID:
      return isSetPid();
    case USER_NAME:
      return isSetUserName();
    case MEMBER_ID:
      return isSetMemberId();
    case DEPARTMENT:
      return isSetDepartment();
    case JOB_TITLE:
      return isSetJobTitle();
    case MAIL:
      return isSetMail();
    case PWD:
      return isSetPwd();
    case PHOTO_URL:
      return isSetPhotoUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SysUser)
      return this.equals((SysUser)that);
    return false;
  }

  public boolean equals(SysUser that) {
    if (that == null)
      return false;

    boolean this_present_pid = true;
    boolean that_present_pid = true;
    if (this_present_pid || that_present_pid) {
      if (!(this_present_pid && that_present_pid))
        return false;
      if (this.pid != that.pid)
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_memberId = true && this.isSetMemberId();
    boolean that_present_memberId = true && that.isSetMemberId();
    if (this_present_memberId || that_present_memberId) {
      if (!(this_present_memberId && that_present_memberId))
        return false;
      if (!this.memberId.equals(that.memberId))
        return false;
    }

    boolean this_present_department = true && this.isSetDepartment();
    boolean that_present_department = true && that.isSetDepartment();
    if (this_present_department || that_present_department) {
      if (!(this_present_department && that_present_department))
        return false;
      if (!this.department.equals(that.department))
        return false;
    }

    boolean this_present_jobTitle = true && this.isSetJobTitle();
    boolean that_present_jobTitle = true && that.isSetJobTitle();
    if (this_present_jobTitle || that_present_jobTitle) {
      if (!(this_present_jobTitle && that_present_jobTitle))
        return false;
      if (!this.jobTitle.equals(that.jobTitle))
        return false;
    }

    boolean this_present_mail = true && this.isSetMail();
    boolean that_present_mail = true && that.isSetMail();
    if (this_present_mail || that_present_mail) {
      if (!(this_present_mail && that_present_mail))
        return false;
      if (!this.mail.equals(that.mail))
        return false;
    }

    boolean this_present_pwd = true && this.isSetPwd();
    boolean that_present_pwd = true && that.isSetPwd();
    if (this_present_pwd || that_present_pwd) {
      if (!(this_present_pwd && that_present_pwd))
        return false;
      if (!this.pwd.equals(that.pwd))
        return false;
    }

    boolean this_present_photoUrl = true && this.isSetPhotoUrl();
    boolean that_present_photoUrl = true && that.isSetPhotoUrl();
    if (this_present_photoUrl || that_present_photoUrl) {
      if (!(this_present_photoUrl && that_present_photoUrl))
        return false;
      if (!this.photoUrl.equals(that.photoUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_pid = true;
    list.add(present_pid);
    if (present_pid)
      list.add(pid);

    boolean present_userName = true && (isSetUserName());
    list.add(present_userName);
    if (present_userName)
      list.add(userName);

    boolean present_memberId = true && (isSetMemberId());
    list.add(present_memberId);
    if (present_memberId)
      list.add(memberId);

    boolean present_department = true && (isSetDepartment());
    list.add(present_department);
    if (present_department)
      list.add(department);

    boolean present_jobTitle = true && (isSetJobTitle());
    list.add(present_jobTitle);
    if (present_jobTitle)
      list.add(jobTitle);

    boolean present_mail = true && (isSetMail());
    list.add(present_mail);
    if (present_mail)
      list.add(mail);

    boolean present_pwd = true && (isSetPwd());
    list.add(present_pwd);
    if (present_pwd)
      list.add(pwd);

    boolean present_photoUrl = true && (isSetPhotoUrl());
    list.add(present_photoUrl);
    if (present_photoUrl)
      list.add(photoUrl);

    return list.hashCode();
  }

  @Override
  public int compareTo(SysUser other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPid()).compareTo(other.isSetPid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pid, other.pid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMemberId()).compareTo(other.isSetMemberId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemberId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memberId, other.memberId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepartment()).compareTo(other.isSetDepartment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepartment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.department, other.department);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobTitle()).compareTo(other.isSetJobTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobTitle, other.jobTitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMail()).compareTo(other.isSetMail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mail, other.mail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPwd()).compareTo(other.isSetPwd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPwd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pwd, other.pwd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhotoUrl()).compareTo(other.isSetPhotoUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhotoUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.photoUrl, other.photoUrl);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SysUser(");
    boolean first = true;

    sb.append("pid:");
    sb.append(this.pid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("memberId:");
    if (this.memberId == null) {
      sb.append("null");
    } else {
      sb.append(this.memberId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("department:");
    if (this.department == null) {
      sb.append("null");
    } else {
      sb.append(this.department);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobTitle:");
    if (this.jobTitle == null) {
      sb.append("null");
    } else {
      sb.append(this.jobTitle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mail:");
    if (this.mail == null) {
      sb.append("null");
    } else {
      sb.append(this.mail);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pwd:");
    if (this.pwd == null) {
      sb.append("null");
    } else {
      sb.append(this.pwd);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("photoUrl:");
    if (this.photoUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.photoUrl);
    }
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

  private static class SysUserStandardSchemeFactory implements SchemeFactory {
    public SysUserStandardScheme getScheme() {
      return new SysUserStandardScheme();
    }
  }

  private static class SysUserStandardScheme extends StandardScheme<SysUser> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SysUser struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pid = iprot.readI32();
              struct.setPidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MEMBER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.memberId = iprot.readString();
              struct.setMemberIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEPARTMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.department = iprot.readString();
              struct.setDepartmentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // JOB_TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobTitle = iprot.readString();
              struct.setJobTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mail = iprot.readString();
              struct.setMailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pwd = iprot.readString();
              struct.setPwdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // PHOTO_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.photoUrl = iprot.readString();
              struct.setPhotoUrlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SysUser struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PID_FIELD_DESC);
      oprot.writeI32(struct.pid);
      oprot.writeFieldEnd();
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      if (struct.memberId != null) {
        oprot.writeFieldBegin(MEMBER_ID_FIELD_DESC);
        oprot.writeString(struct.memberId);
        oprot.writeFieldEnd();
      }
      if (struct.department != null) {
        oprot.writeFieldBegin(DEPARTMENT_FIELD_DESC);
        oprot.writeString(struct.department);
        oprot.writeFieldEnd();
      }
      if (struct.jobTitle != null) {
        oprot.writeFieldBegin(JOB_TITLE_FIELD_DESC);
        oprot.writeString(struct.jobTitle);
        oprot.writeFieldEnd();
      }
      if (struct.mail != null) {
        oprot.writeFieldBegin(MAIL_FIELD_DESC);
        oprot.writeString(struct.mail);
        oprot.writeFieldEnd();
      }
      if (struct.pwd != null) {
        oprot.writeFieldBegin(PWD_FIELD_DESC);
        oprot.writeString(struct.pwd);
        oprot.writeFieldEnd();
      }
      if (struct.photoUrl != null) {
        oprot.writeFieldBegin(PHOTO_URL_FIELD_DESC);
        oprot.writeString(struct.photoUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SysUserTupleSchemeFactory implements SchemeFactory {
    public SysUserTupleScheme getScheme() {
      return new SysUserTupleScheme();
    }
  }

  private static class SysUserTupleScheme extends TupleScheme<SysUser> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SysUser struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPid()) {
        optionals.set(0);
      }
      if (struct.isSetUserName()) {
        optionals.set(1);
      }
      if (struct.isSetMemberId()) {
        optionals.set(2);
      }
      if (struct.isSetDepartment()) {
        optionals.set(3);
      }
      if (struct.isSetJobTitle()) {
        optionals.set(4);
      }
      if (struct.isSetMail()) {
        optionals.set(5);
      }
      if (struct.isSetPwd()) {
        optionals.set(6);
      }
      if (struct.isSetPhotoUrl()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetPid()) {
        oprot.writeI32(struct.pid);
      }
      if (struct.isSetUserName()) {
        oprot.writeString(struct.userName);
      }
      if (struct.isSetMemberId()) {
        oprot.writeString(struct.memberId);
      }
      if (struct.isSetDepartment()) {
        oprot.writeString(struct.department);
      }
      if (struct.isSetJobTitle()) {
        oprot.writeString(struct.jobTitle);
      }
      if (struct.isSetMail()) {
        oprot.writeString(struct.mail);
      }
      if (struct.isSetPwd()) {
        oprot.writeString(struct.pwd);
      }
      if (struct.isSetPhotoUrl()) {
        oprot.writeString(struct.photoUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SysUser struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.pid = iprot.readI32();
        struct.setPidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userName = iprot.readString();
        struct.setUserNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.memberId = iprot.readString();
        struct.setMemberIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.department = iprot.readString();
        struct.setDepartmentIsSet(true);
      }
      if (incoming.get(4)) {
        struct.jobTitle = iprot.readString();
        struct.setJobTitleIsSet(true);
      }
      if (incoming.get(5)) {
        struct.mail = iprot.readString();
        struct.setMailIsSet(true);
      }
      if (incoming.get(6)) {
        struct.pwd = iprot.readString();
        struct.setPwdIsSet(true);
      }
      if (incoming.get(7)) {
        struct.photoUrl = iprot.readString();
        struct.setPhotoUrlIsSet(true);
      }
    }
  }

}

