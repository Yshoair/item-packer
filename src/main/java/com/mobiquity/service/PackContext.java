package com.mobiquity.service;

import com.mobiquity.contract.IPackStrategy;
import com.mobiquity.model.Package;

public class PackContext {
  private IPackStrategy packStrategy;

  public void setPackStrategy(IPackStrategy packStrategy) {
    this.packStrategy = packStrategy;
  }

  public Package executePackStrategy(Package p) {
    return this.packStrategy.pack(p);
  }
}