package io.vertx.core.json.mappers;

import io.vertx.core.spi.json.JsonMapper;

import java.util.Objects;

public class MyDoublePojo {

  public static class MyDoublePojoJsonMapper implements JsonMapper<MyDoublePojo, Number> {

    @Override
    public MyDoublePojo deserialize(Number value) throws IllegalArgumentException {
      return new MyDoublePojo().setValue(value.doubleValue());
    }

    @Override
    public Double serialize(MyDoublePojo value) throws IllegalArgumentException {
      return value.getValue();
    }

    @Override
    public Class<MyDoublePojo> getTargetClass() {
      return MyDoublePojo.class;
    }
  }

  double value;

  public double getValue() {
    return value;
  }

  public MyDoublePojo setValue(double value) {
    this.value = value;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyDoublePojo that = (MyDoublePojo) o;
    return value == that.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
