package com.despat.structural.facade;

class OrderFacade {
  
  private OrderProcess orderProcess;
  private OrderCustomer orderCustomer;
  private OrderValue orderValue;

  public OrderFacade(OrderProcess orderProcess, OrderCustomer orderCustomer, OrderValue orderValue) {
    this.orderValue = orderValue;
    this.orderCustomer = orderCustomer;
    this.orderProcess = orderProcess;
  }

  public OrderFacade() {
    this.orderValue = new OrderValue();
    this.orderProcess = new OrderProcess();
    this.orderCustomer = new OrderCustomer();
  }

  public void procces() {
    this.orderProcess.orderProcess();
    this.orderCustomer.getCustomer();
    this.orderValue.getTotal();
    System.out.print("...Finish");
  }
}
