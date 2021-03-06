// Generated by data binding compiler. Do not edit!
package com.androdocs.weatherbuddy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.androdocs.weatherbuddy.R;
import com.example.weatherbuddy.AvatarViewModel;
import com.example.weatherbuddy.MyImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final TextView address;

  @NonNull
  public final MyImageView androidAvatar;

  @NonNull
  public final ImageView arrowDown;

  @NonNull
  public final ImageView arrowUp;

  @NonNull
  public final ConstraintLayout contrainLayout;

  @NonNull
  public final TextView dateText;

  @NonNull
  public final TextClock digitalClock;

  @NonNull
  public final TextView errorText;

  @NonNull
  public final ImageView hamburgermenu;

  @NonNull
  public final TextView humidity;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final TextView maxTemp;

  @NonNull
  public final TextView minTemp;

  @NonNull
  public final LinearLayout overviewContainer;

  @NonNull
  public final TextView status;

  @NonNull
  public final TextView temp;

  @NonNull
  public final TextView wind;

  @Bindable
  protected MyImageView mMyImageView;

  @Bindable
  protected AvatarViewModel mAvatarViewModel;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView address, MyImageView androidAvatar, ImageView arrowDown, ImageView arrowUp,
      ConstraintLayout contrainLayout, TextView dateText, TextClock digitalClock,
      TextView errorText, ImageView hamburgermenu, TextView humidity, ImageView imageView2,
      ProgressBar loader, TextView maxTemp, TextView minTemp, LinearLayout overviewContainer,
      TextView status, TextView temp, TextView wind) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.androidAvatar = androidAvatar;
    this.arrowDown = arrowDown;
    this.arrowUp = arrowUp;
    this.contrainLayout = contrainLayout;
    this.dateText = dateText;
    this.digitalClock = digitalClock;
    this.errorText = errorText;
    this.hamburgermenu = hamburgermenu;
    this.humidity = humidity;
    this.imageView2 = imageView2;
    this.loader = loader;
    this.maxTemp = maxTemp;
    this.minTemp = minTemp;
    this.overviewContainer = overviewContainer;
    this.status = status;
    this.temp = temp;
    this.wind = wind;
  }

  public abstract void setMyImageView(@Nullable MyImageView myImageView);

  @Nullable
  public MyImageView getMyImageView() {
    return mMyImageView;
  }

  public abstract void setAvatarViewModel(@Nullable AvatarViewModel avatarViewModel);

  @Nullable
  public AvatarViewModel getAvatarViewModel() {
    return mAvatarViewModel;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
