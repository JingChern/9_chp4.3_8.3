package com.example.android.marsrealestate.overview;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.marsrealestate.R;
import com.example.android.marsrealestate.network.MarsProperty;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class OverviewFragmentDirections {
  private OverviewFragmentDirections() {
  }

  @NonNull
  public static ActionShowDetail actionShowDetail(@NonNull MarsProperty selectedProperty) {
    return new ActionShowDetail(selectedProperty);
  }

  public static class ActionShowDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionShowDetail(@NonNull MarsProperty selectedProperty) {
      if (selectedProperty == null) {
        throw new IllegalArgumentException("Argument \"selectedProperty\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProperty", selectedProperty);
    }

    @NonNull
    public ActionShowDetail setSelectedProperty(@NonNull MarsProperty selectedProperty) {
      if (selectedProperty == null) {
        throw new IllegalArgumentException("Argument \"selectedProperty\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("selectedProperty", selectedProperty);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_showDetail;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public MarsProperty getSelectedProperty() {
      return (MarsProperty) arguments.get("selectedProperty");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionShowDetail that = (ActionShowDetail) object;
      if (arguments.containsKey("selectedProperty") != that.arguments.containsKey("selectedProperty")) {
        return false;
      }
      if (getSelectedProperty() != null ? !getSelectedProperty().equals(that.getSelectedProperty()) : that.getSelectedProperty() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSelectedProperty() != null ? getSelectedProperty().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionShowDetail(actionId=" + getActionId() + "){"
          + "selectedProperty=" + getSelectedProperty()
          + "}";
    }
  }
}
