// Generated by view binder compiler. Do not edit!
package com.example.project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAuthBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText authEmailEditView;

  @NonNull
  public final TextView authMainTextView;

  @NonNull
  public final EditText authPasswordEditView;

  @NonNull
  public final Button goSignInBtn;

  @NonNull
  public final Button googleLoginBtn;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final Button logoutBtn;

  @NonNull
  public final Button signBtn;

  private ActivityAuthBinding(@NonNull ScrollView rootView, @NonNull EditText authEmailEditView,
      @NonNull TextView authMainTextView, @NonNull EditText authPasswordEditView,
      @NonNull Button goSignInBtn, @NonNull Button googleLoginBtn, @NonNull Button loginBtn,
      @NonNull Button logoutBtn, @NonNull Button signBtn) {
    this.rootView = rootView;
    this.authEmailEditView = authEmailEditView;
    this.authMainTextView = authMainTextView;
    this.authPasswordEditView = authPasswordEditView;
    this.goSignInBtn = goSignInBtn;
    this.googleLoginBtn = googleLoginBtn;
    this.loginBtn = loginBtn;
    this.logoutBtn = logoutBtn;
    this.signBtn = signBtn;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_auth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAuthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.authEmailEditView;
      EditText authEmailEditView = ViewBindings.findChildViewById(rootView, id);
      if (authEmailEditView == null) {
        break missingId;
      }

      id = R.id.authMainTextView;
      TextView authMainTextView = ViewBindings.findChildViewById(rootView, id);
      if (authMainTextView == null) {
        break missingId;
      }

      id = R.id.authPasswordEditView;
      EditText authPasswordEditView = ViewBindings.findChildViewById(rootView, id);
      if (authPasswordEditView == null) {
        break missingId;
      }

      id = R.id.goSignInBtn;
      Button goSignInBtn = ViewBindings.findChildViewById(rootView, id);
      if (goSignInBtn == null) {
        break missingId;
      }

      id = R.id.googleLoginBtn;
      Button googleLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (googleLoginBtn == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      Button loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.logoutBtn;
      Button logoutBtn = ViewBindings.findChildViewById(rootView, id);
      if (logoutBtn == null) {
        break missingId;
      }

      id = R.id.signBtn;
      Button signBtn = ViewBindings.findChildViewById(rootView, id);
      if (signBtn == null) {
        break missingId;
      }

      return new ActivityAuthBinding((ScrollView) rootView, authEmailEditView, authMainTextView,
          authPasswordEditView, goSignInBtn, googleLoginBtn, loginBtn, logoutBtn, signBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}