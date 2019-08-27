package cn.itrip.beans;


import java.sql.Timestamp;

public class ItripHotelOrder {

  private Integer id;
  private Integer userId;
  private Integer orderType;
  private String orderNo;
  private String tradeNo;
  private Integer hotelId;
  private String hotelName;
  private Integer roomId;
  private Integer count;
  private Integer bookingDays;
  private Timestamp checkInDate;
  private Timestamp checkOutDate;
  private Integer orderStatus;
  private double payAmount;
  private Integer payType;
  private String noticePhone;
  private String noticeEmail;
  private String specialRequirement;
  private Integer isNeedInvoice;
  private Integer invoiceType;
  private String invoiceHead;
  private String linkUserName;
  private Integer bookType;
  private Timestamp creationDate;
  private Integer createdBy;
  private Timestamp modifyDate;
  private Integer modifiedBy;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getOrderType() {
    return orderType;
  }

  public void setOrderType(Integer orderType) {
    this.orderType = orderType;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public String getTradeNo() {
    return tradeNo;
  }

  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }

  public Integer getHotelId() {
    return hotelId;
  }

  public void setHotelId(Integer hotelId) {
    this.hotelId = hotelId;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Integer getBookingDays() {
    return bookingDays;
  }

  public void setBookingDays(Integer bookingDays) {
    this.bookingDays = bookingDays;
  }

  public Timestamp getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(Timestamp checkInDate) {
    this.checkInDate = checkInDate;
  }

  public Timestamp getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(Timestamp checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }

  public double getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(double payAmount) {
    this.payAmount = payAmount;
  }

  public Integer getPayType() {
    return payType;
  }

  public void setPayType(Integer payType) {
    this.payType = payType;
  }

  public String getNoticePhone() {
    return noticePhone;
  }

  public void setNoticePhone(String noticePhone) {
    this.noticePhone = noticePhone;
  }

  public String getNoticeEmail() {
    return noticeEmail;
  }

  public void setNoticeEmail(String noticeEmail) {
    this.noticeEmail = noticeEmail;
  }

  public String getSpecialRequirement() {
    return specialRequirement;
  }

  public void setSpecialRequirement(String specialRequirement) {
    this.specialRequirement = specialRequirement;
  }

  public Integer getIsNeedInvoice() {
    return isNeedInvoice;
  }

  public void setIsNeedInvoice(Integer isNeedInvoice) {
    this.isNeedInvoice = isNeedInvoice;
  }

  public Integer getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
  }

  public String getInvoiceHead() {
    return invoiceHead;
  }

  public void setInvoiceHead(String invoiceHead) {
    this.invoiceHead = invoiceHead;
  }

  public String getLinkUserName() {
    return linkUserName;
  }

  public void setLinkUserName(String linkUserName) {
    this.linkUserName = linkUserName;
  }

  public Integer getBookType() {
    return bookType;
  }

  public void setBookType(Integer bookType) {
    this.bookType = bookType;
  }

  public Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Timestamp creationDate) {
    this.creationDate = creationDate;
  }

  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }

  public Integer getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
}
