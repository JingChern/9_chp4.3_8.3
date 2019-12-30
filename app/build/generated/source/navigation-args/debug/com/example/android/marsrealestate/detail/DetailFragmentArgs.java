package com.example.android.marsrealestate.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.android.marsrealestate.network.MarsProperty;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("selectedProperty")) {
      MarsProperty selectedProperty;
      if (Parcelable.class.isAssignableFrom(MarsProperty.class) || Serializable.class.isAssignableFrom(MarsProperty.class)) {
        selectedProperty = (MarsProperty) bundle.get("selectedProperty");
      } else {
        throw new UnsupportedOperationException(MarsProperty.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (selectedProperty == null) {
        throw new IllegalArgumentException("Argument \"selectedProperty\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("selectedProperty", selectedProperty);
    } else {
      throw new IllegalArgumentException("Required argument \"selectedProperty\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public MarsProperty getSelectedProperty() {
    return (MarsProperty) arguments.get("selectedProperty");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("selectedProperty")) {
      MarsProperty selectedProperty = (MarsProperty) arguments.get("selectedProperty");
      if (Parcelable.class.isAssignableFrom(MarsProperty.class) || selectedProperty == null) {
        __result.putParcelable("selectedProperty", Parcelable.class.cast(selectedProperty));
      } else if (Serializable.class.isAssignableFrom(MarsProperty.class)) {
        __result.putSerializable("selectedProperty", Serializable.class.cast(selectedProperty));
      } else {
        throw new UnsupportedOperationException(MarsProperty.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("selectedProperty") != that.arguments.containsKey("selectedProperty")) {
      return false;
    }
    if (getSelectedProperty() != null ? !getSelectedProperty().equals(that.getSelectedProperty()) : that.getSelectedProperty() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSelectedProperty() != null ? getSelectedProperty().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "selectedProperty=" + getSelectedProperty()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull MarsProperty selectedProperty) {
      if (selectedProperty == null) {
        throw new IllegalArgumentException("Argument \"selectedProperty\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProperty", selectedProperty);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setSelectedProperty(@NonNull MarsProperty selectedProperty) {
      if (selectedProperty == null) {
        throw new IllegalArgumentException("Argument \"selectedProperty\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProperty", selectedProperty);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public MarsProperty getSelectedProperty() {
      return (MarsProperty) arguments.get("selectedProperty");
    }
  }
}
