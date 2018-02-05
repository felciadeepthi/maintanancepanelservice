package com.cvshealth.eccm.maintanancepanelservices.exception;

public class CommunicationControllerException extends Exception {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String errorMessage;

  private int errorCode;

  public CommunicationControllerException() {

    super();

  }

  public CommunicationControllerException(String errorMessage) {

    super(errorMessage);

    this.errorMessage = errorMessage;

  }

  public CommunicationControllerException(String errorMessage, int errorCode) {

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
