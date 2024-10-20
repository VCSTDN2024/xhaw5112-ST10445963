// Generated by view binder compiler. Do not edit!
package com.example.xhaw_androiddevelopment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.xhaw_androiddevelopment.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityContactusBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView aboutUsIcon;

  @NonNull
  public final TextView aboutUsLabel;

  @NonNull
  public final LinearLayout aboutUsLayout;

  @NonNull
  public final TextView address;

  @NonNull
  public final ImageView backIcon;

  @NonNull
  public final ImageView cartIcon;

  @NonNull
  public final TextView cartLabel;

  @NonNull
  public final LinearLayout cartLayout;

  @NonNull
  public final ImageView contactUsIcon;

  @NonNull
  public final TextView contactUsLabel;

  @NonNull
  public final LinearLayout contactUsLayout;

  @NonNull
  public final LinearLayout courseLayout;

  @NonNull
  public final ImageView coursesIcon;

  @NonNull
  public final TextView email;

  @NonNull
  public final ImageView homeIcon;

  @NonNull
  public final TextView homeLabel;

  @NonNull
  public final LinearLayout homeLayout;

  @NonNull
  public final ConstraintLayout icon2;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView locationIcon;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final ImageView mapView;

  @NonNull
  public final TextView organizationName;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TextView telephone;

  @NonNull
  public final TextView txtHome;

  @NonNull
  public final TextView txtHome1;

  private ActivityContactusBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView aboutUsIcon, @NonNull TextView aboutUsLabel,
      @NonNull LinearLayout aboutUsLayout, @NonNull TextView address, @NonNull ImageView backIcon,
      @NonNull ImageView cartIcon, @NonNull TextView cartLabel, @NonNull LinearLayout cartLayout,
      @NonNull ImageView contactUsIcon, @NonNull TextView contactUsLabel,
      @NonNull LinearLayout contactUsLayout, @NonNull LinearLayout courseLayout,
      @NonNull ImageView coursesIcon, @NonNull TextView email, @NonNull ImageView homeIcon,
      @NonNull TextView homeLabel, @NonNull LinearLayout homeLayout,
      @NonNull ConstraintLayout icon2, @NonNull ImageView imageView4,
      @NonNull ImageView locationIcon, @NonNull ImageView logo, @NonNull ImageView mapView,
      @NonNull TextView organizationName, @NonNull TableLayout tableLayout,
      @NonNull TextView telephone, @NonNull TextView txtHome, @NonNull TextView txtHome1) {
    this.rootView = rootView;
    this.aboutUsIcon = aboutUsIcon;
    this.aboutUsLabel = aboutUsLabel;
    this.aboutUsLayout = aboutUsLayout;
    this.address = address;
    this.backIcon = backIcon;
    this.cartIcon = cartIcon;
    this.cartLabel = cartLabel;
    this.cartLayout = cartLayout;
    this.contactUsIcon = contactUsIcon;
    this.contactUsLabel = contactUsLabel;
    this.contactUsLayout = contactUsLayout;
    this.courseLayout = courseLayout;
    this.coursesIcon = coursesIcon;
    this.email = email;
    this.homeIcon = homeIcon;
    this.homeLabel = homeLabel;
    this.homeLayout = homeLayout;
    this.icon2 = icon2;
    this.imageView4 = imageView4;
    this.locationIcon = locationIcon;
    this.logo = logo;
    this.mapView = mapView;
    this.organizationName = organizationName;
    this.tableLayout = tableLayout;
    this.telephone = telephone;
    this.txtHome = txtHome;
    this.txtHome1 = txtHome1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityContactusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityContactusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_contactus, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityContactusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_us_icon;
      ImageView aboutUsIcon = ViewBindings.findChildViewById(rootView, id);
      if (aboutUsIcon == null) {
        break missingId;
      }

      id = R.id.about_us_label;
      TextView aboutUsLabel = ViewBindings.findChildViewById(rootView, id);
      if (aboutUsLabel == null) {
        break missingId;
      }

      id = R.id.about_us_layout;
      LinearLayout aboutUsLayout = ViewBindings.findChildViewById(rootView, id);
      if (aboutUsLayout == null) {
        break missingId;
      }

      id = R.id.address;
      TextView address = ViewBindings.findChildViewById(rootView, id);
      if (address == null) {
        break missingId;
      }

      id = R.id.back_icon;
      ImageView backIcon = ViewBindings.findChildViewById(rootView, id);
      if (backIcon == null) {
        break missingId;
      }

      id = R.id.cart_icon;
      ImageView cartIcon = ViewBindings.findChildViewById(rootView, id);
      if (cartIcon == null) {
        break missingId;
      }

      id = R.id.cart_label;
      TextView cartLabel = ViewBindings.findChildViewById(rootView, id);
      if (cartLabel == null) {
        break missingId;
      }

      id = R.id.cart_layout;
      LinearLayout cartLayout = ViewBindings.findChildViewById(rootView, id);
      if (cartLayout == null) {
        break missingId;
      }

      id = R.id.contact_us_icon;
      ImageView contactUsIcon = ViewBindings.findChildViewById(rootView, id);
      if (contactUsIcon == null) {
        break missingId;
      }

      id = R.id.contact_us_label;
      TextView contactUsLabel = ViewBindings.findChildViewById(rootView, id);
      if (contactUsLabel == null) {
        break missingId;
      }

      id = R.id.contact_us_layout;
      LinearLayout contactUsLayout = ViewBindings.findChildViewById(rootView, id);
      if (contactUsLayout == null) {
        break missingId;
      }

      id = R.id.course_layout;
      LinearLayout courseLayout = ViewBindings.findChildViewById(rootView, id);
      if (courseLayout == null) {
        break missingId;
      }

      id = R.id.courses_icon;
      ImageView coursesIcon = ViewBindings.findChildViewById(rootView, id);
      if (coursesIcon == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.home_icon;
      ImageView homeIcon = ViewBindings.findChildViewById(rootView, id);
      if (homeIcon == null) {
        break missingId;
      }

      id = R.id.home_label;
      TextView homeLabel = ViewBindings.findChildViewById(rootView, id);
      if (homeLabel == null) {
        break missingId;
      }

      id = R.id.home_layout;
      LinearLayout homeLayout = ViewBindings.findChildViewById(rootView, id);
      if (homeLayout == null) {
        break missingId;
      }

      ConstraintLayout icon2 = (ConstraintLayout) rootView;

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.location_icon;
      ImageView locationIcon = ViewBindings.findChildViewById(rootView, id);
      if (locationIcon == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.map_view;
      ImageView mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.organization_name;
      TextView organizationName = ViewBindings.findChildViewById(rootView, id);
      if (organizationName == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.telephone;
      TextView telephone = ViewBindings.findChildViewById(rootView, id);
      if (telephone == null) {
        break missingId;
      }

      id = R.id.txtHome;
      TextView txtHome = ViewBindings.findChildViewById(rootView, id);
      if (txtHome == null) {
        break missingId;
      }

      id = R.id.txtHome1;
      TextView txtHome1 = ViewBindings.findChildViewById(rootView, id);
      if (txtHome1 == null) {
        break missingId;
      }

      return new ActivityContactusBinding((ConstraintLayout) rootView, aboutUsIcon, aboutUsLabel,
          aboutUsLayout, address, backIcon, cartIcon, cartLabel, cartLayout, contactUsIcon,
          contactUsLabel, contactUsLayout, courseLayout, coursesIcon, email, homeIcon, homeLabel,
          homeLayout, icon2, imageView4, locationIcon, logo, mapView, organizationName, tableLayout,
          telephone, txtHome, txtHome1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
