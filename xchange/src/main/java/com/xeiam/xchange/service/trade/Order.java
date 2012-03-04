/**
 * Copyright (C) 2012 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.service.trade;

import com.xeiam.xchange.Constants;

/**
 * Data object representing an order
 */
public class Order {

  private String type;
  private Long amount_int;
  private String amountCurrency;
  private String priceCurrency;

  public static String getBid() {
    return Constants.BID;
  }

  public static void setBid(String bid) {
    Constants.BID = bid;
  }

  public static String getAsk() {
    return Constants.ASK;
  }

  public static void setAsk(String ask) {
    Constants.ASK = ask;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getAmount_int() {
    return amount_int;
  }

  public void setAmount_int(Long amount_int) {
    this.amount_int = amount_int;
  }

  public String getAmountCurrency() {
    return amountCurrency;
  }

  public void setAmountCurrency(String amountCurrency) {
    this.amountCurrency = amountCurrency;
  }

  public String getPriceCurrency() {
    return priceCurrency;
  }

  public void setPriceCurrency(String priceCurrency) {
    this.priceCurrency = priceCurrency;
  }

}
