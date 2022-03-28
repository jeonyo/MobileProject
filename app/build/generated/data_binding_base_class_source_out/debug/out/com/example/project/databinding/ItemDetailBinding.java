// Generated by view binder compiler. Do not edit!
package com.example.project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout MainDetailView;

  @NonNull
  public final TextView detailContentView;

  @NonNull
  public final ImageView detailImageView;

  @NonNull
  public final TextView detailTitleView;

  private ItemDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout MainDetailView, @NonNull TextView detailContentView,
      @NonNull ImageView detailImageView, @NonNull TextView detailTitleView) {
    this.rootView = rootView;
    this.MainDetailView = MainDetailView;
    this.detailContentView = detailContentView;
    this.detailImageView = detailImageView;
    this.detailTitleView = detailTitleView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout MainDetailView = (ConstraintLayout) rootView;

      id = R.id.detailContentView;
      TextView detailContentView = ViewBindings.findChildViewById(rootView, id);
      if (detailContentView == null) {
        break missingId;
      }

      id = R.id.detailImageView;
      ImageView detailImageView = ViewBindings.findChildViewById(rootView, id);
      if (detailImageView == null) {
        break missingId;
      }

      id = R.id.detailTitleView;
      TextView detailTitleView = ViewBindings.findChildViewById(rootView, id);
      if (detailTitleView == null) {
        break missingId;
      }

      return new ItemDetailBinding((ConstraintLayout) rootView, MainDetailView, detailContentView,
          detailImageView, detailTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}