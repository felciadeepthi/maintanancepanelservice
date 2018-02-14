package com.cvshealth.eccm.maintanancepanelservices.exception;

public class DataNotFoundControllerException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String errorMessage;

  private int errorCode;

  public DataNotFoundControllerException() {

    super();

  }

  public DataNotFoundControllerException(String errorMessage) {

    super(errorMessage);

    this.errorMessage = errorMessage;

  }

  public DataNotFoundControllerException(String errorMessage, int errorCode) {

    this.errorMessage = errorMessage;
    this.errorCode = errorCode;

  }

  public int getErrorCode() {
    return errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;

  }

  public void setErrorCode(int errorCode) {
    this.errorCode = errorCode;
  }

}
