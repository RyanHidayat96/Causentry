package com.midtrans.sdk.uikit.widgets;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import defpackage.MediaBrowserCompatConnectionCallback;
import defpackage.areCroppingInDifferentDirection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class FancyButton extends LinearLayout {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "FancyButton";
    private int INotificationSideChannel;
    private String INotificationSideChannelDefault;
    private int INotificationSideChannelStub;
    private int INotificationSideChannelStubProxy;
    private String IconCompatParcelizer;
    private int MediaBrowserCompat;
    private int RemoteActionCompatParcelizer;
    private TextView TuitionPaymentFragmentbindingInflater1;
    private ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f856a;
    private TextView asBinder;
    private boolean asInterface;
    private String b;
    private int cancel;
    private int cancelAll;
    private int connect;
    private boolean d;
    private int disconnect;
    private Context g;
    private int getExtras;
    private int getInterfaceDescriptor;
    private int getItem;
    private int getNotifyChildrenChangedOptions;
    private int getRoot;
    private Typeface getServiceComponent;
    private boolean getSessionToken;
    private Typeface isConnected;
    private int notify;
    private int onTransact;
    private int read;
    private int search;
    private boolean sendCustomAction;
    private Drawable write;

    public FancyButton(Context context) {
        super(context);
        this.INotificationSideChannel = ViewCompat.MEASURED_STATE_MASK;
        this.cancel = 0;
        this.notify = Color.parseColor("#f6f7f9");
        this.cancelAll = Color.parseColor("#bec2c9");
        this.onTransact = Color.parseColor("#dddfe2");
        this.getInterfaceDescriptor = -1;
        this.INotificationSideChannelStub = -1;
        this.RemoteActionCompatParcelizer = MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), 15.0f);
        this.INotificationSideChannelStubProxy = 17;
        this.INotificationSideChannelDefault = null;
        this.write = null;
        this.MediaBrowserCompat = MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), 15.0f);
        this.IconCompatParcelizer = null;
        this.connect = 1;
        this.read = 10;
        this.getItem = 10;
        this.getNotifyChildrenChangedOptions = 0;
        this.disconnect = 0;
        this.getRoot = 0;
        this.getExtras = 0;
        this.search = 0;
        this.getSessionToken = true;
        this.sendCustomAction = false;
        this.isConnected = null;
        this.getServiceComponent = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "fontawesome.ttf";
        this.b = "robotoregular.ttf";
        this.d = false;
        this.asInterface = false;
        this.f856a = true;
        this.g = context;
        this.isConnected = MediaBrowserCompatConnectionCallback.b(context, "robotoregular.ttf", null);
        this.getServiceComponent = MediaBrowserCompatConnectionCallback.b(this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        b();
    }

    private TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.IconCompatParcelizer == null) {
            return null;
        }
        TextView textView = new TextView(this.g);
        textView.setTextColor(this.getSessionToken ? this.INotificationSideChannelStub : this.cancelAll);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = this.getItem;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.read;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.getNotifyChildrenChangedOptions;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.disconnect;
        if (this.asBinder != null) {
            int i = this.connect;
            if (i == 3 || i == 4) {
                layoutParams.gravity = 17;
                textView.setGravity(17);
            } else {
                textView.setGravity(16);
                layoutParams.gravity = 16;
            }
        } else {
            layoutParams.gravity = 17;
            textView.setGravity(16);
        }
        textView.setLayoutParams(layoutParams);
        if (isInEditMode()) {
            textView.setTextSize(MediaBrowserCompatConnectionCallback.b(getContext(), this.MediaBrowserCompat));
            textView.setText("O");
            return textView;
        }
        textView.setTextSize(MediaBrowserCompatConnectionCallback.b(getContext(), this.MediaBrowserCompat));
        textView.setText(this.IconCompatParcelizer);
        textView.setTypeface(this.getServiceComponent);
        return textView;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Drawable rippleDrawable;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.search);
        if (this.d) {
            gradientDrawable.setColor(getResources().getColor(R.color.transparent));
        } else {
            gradientDrawable.setColor(this.INotificationSideChannel);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.search);
        gradientDrawable2.setColor(this.cancel);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(this.search);
        gradientDrawable3.setColor(this.notify);
        gradientDrawable3.setStroke(this.getExtras, this.onTransact);
        int i = this.getRoot;
        if (i != 0) {
            gradientDrawable.setStroke(this.getExtras, i);
        }
        if (!this.getSessionToken) {
            gradientDrawable.setStroke(this.getExtras, this.onTransact);
            if (this.d) {
                gradientDrawable3.setColor(getResources().getColor(R.color.transparent));
            }
        }
        if (this.f856a) {
            if (this.getSessionToken) {
                rippleDrawable = gradientDrawable3;
                rippleDrawable = new RippleDrawable(ColorStateList.valueOf(this.cancel), gradientDrawable, gradientDrawable2);
            }
            rippleDrawable = gradientDrawable3;
            setBackground(rippleDrawable);
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(this.search);
        if (this.d) {
            gradientDrawable4.setColor(getResources().getColor(R.color.transparent));
        } else {
            gradientDrawable4.setColor(this.cancel);
        }
        int i2 = this.getRoot;
        if (i2 != 0) {
            if (this.d) {
                gradientDrawable4.setStroke(this.getExtras, this.cancel);
            } else {
                gradientDrawable4.setStroke(this.getExtras, i2);
            }
        }
        if (!this.getSessionToken) {
            gradientDrawable4.setStroke(this.getExtras, this.onTransact);
        }
        if (this.cancel != 0) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable4);
            stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable4);
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        }
        stateListDrawable.addState(new int[0], gradientDrawable);
        setBackground(stateListDrawable);
    }

    private ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.write == null) {
            return null;
        }
        ImageView imageView = new ImageView(this.g);
        imageView.setImageDrawable(this.write);
        imageView.setPadding(this.read, this.getNotifyChildrenChangedOptions, this.getItem, this.disconnect);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.asBinder != null) {
            int i = this.connect;
            if (i == 3 || i == 4) {
                layoutParams.gravity = 17;
            } else {
                layoutParams.gravity = 16;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 10;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 10;
        } else {
            layoutParams.gravity = 16;
        }
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private void b() {
        TuitionPaymentFragmentbindingInflater1();
        this.asBinder = g();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        removeAllViews();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        ArrayList arrayList = new ArrayList();
        int i = this.connect;
        if (i == 1 || i == 3) {
            ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (imageView != null) {
                arrayList.add(imageView);
            }
            TextView textView = this.TuitionPaymentFragmentbindingInflater1;
            if (textView != null) {
                arrayList.add(textView);
            }
            TextView textView2 = this.asBinder;
            if (textView2 != null) {
                arrayList.add(textView2);
            }
        } else {
            TextView textView3 = this.asBinder;
            if (textView3 != null) {
                arrayList.add(textView3);
            }
            ImageView imageView2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (imageView2 != null) {
                arrayList.add(imageView2);
            }
            TextView textView4 = this.TuitionPaymentFragmentbindingInflater1;
            if (textView4 != null) {
                arrayList.add(textView4);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addView((View) it.next());
        }
    }

    private TextView g() {
        if (this.INotificationSideChannelDefault == null) {
            this.INotificationSideChannelDefault = "Fancy Button";
        }
        TextView textView = new TextView(this.g);
        textView.setText(this.INotificationSideChannelDefault);
        textView.setGravity(this.INotificationSideChannelStubProxy);
        textView.setTextColor(this.getSessionToken ? this.getInterfaceDescriptor : this.cancelAll);
        textView.setTextSize(MediaBrowserCompatConnectionCallback.b(getContext(), this.RemoteActionCompatParcelizer));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (!isInEditMode() && !this.asInterface) {
            textView.setTypeface(this.isConnected);
        }
        return textView;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.INotificationSideChannel = i;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setBorderColor(int i) {
        this.getRoot = i;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setBorderWidth(int i) {
        this.getExtras = i;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setCustomIconFont(String str) {
        Typeface typefaceB = MediaBrowserCompatConnectionCallback.b(this.g, str, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.getServiceComponent = typefaceB;
        TextView textView = this.TuitionPaymentFragmentbindingInflater1;
        if (textView == null) {
            b();
        } else {
            textView.setTypeface(typefaceB);
        }
    }

    public void setCustomTextFont(String str) {
        Typeface typefaceB = MediaBrowserCompatConnectionCallback.b(this.g, str, this.b);
        this.isConnected = typefaceB;
        TextView textView = this.asBinder;
        if (textView == null) {
            b();
        } else {
            textView.setTypeface(typefaceB);
        }
    }

    public void setDisableBackgroundColor(int i) {
        this.notify = i;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setDisableBorderColor(int i) {
        this.onTransact = i;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setDisableTextColor(int i) {
        this.cancelAll = i;
        TextView textView = this.asBinder;
        if (textView == null) {
            b();
        } else {
            if (this.getSessionToken) {
                return;
            }
            textView.setTextColor(i);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.getSessionToken = z;
        b();
    }

    public void setFocusBackgroundColor(int i) {
        this.cancel = i;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setFontIconSize(int i) {
        float f = i;
        this.MediaBrowserCompat = MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), f);
        TextView textView = this.TuitionPaymentFragmentbindingInflater1;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setGhost(boolean z) {
        this.d = z;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setIconColor(int i) {
        TextView textView = this.TuitionPaymentFragmentbindingInflater1;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setIconColorFilter(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public void setIconPadding(int i, int i2, int i3, int i4) {
        this.read = i;
        this.getNotifyChildrenChangedOptions = i2;
        this.getItem = i3;
        this.disconnect = i4;
        ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (imageView != null) {
            imageView.setPadding(i, i2, i3, i4);
        }
        TextView textView = this.TuitionPaymentFragmentbindingInflater1;
        if (textView != null) {
            textView.setPadding(this.read, this.getNotifyChildrenChangedOptions, this.getItem, this.disconnect);
        }
    }

    public void setIconPosition(int i) {
        if (i <= 0 || i >= 5) {
            this.connect = 1;
        } else {
            this.connect = i;
        }
        b();
    }

    public void setIconResource(int i) {
        Drawable drawable = this.g.getResources().getDrawable(i);
        this.write = drawable;
        ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (imageView != null && this.TuitionPaymentFragmentbindingInflater1 == null) {
            imageView.setImageDrawable(drawable);
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = null;
            b();
        }
    }

    public void setRadius(int i) {
        this.search = i;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentbindingInflater1 == null && this.asBinder == null) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public void setText(String str) {
        if (this.sendCustomAction) {
            str = str.toUpperCase();
        }
        this.INotificationSideChannelDefault = str;
        TextView textView = this.asBinder;
        if (textView == null) {
            b();
        } else {
            textView.setText(str);
        }
    }

    public void setTextAllCaps(boolean z) {
        this.sendCustomAction = z;
        setText(this.INotificationSideChannelDefault);
    }

    public void setTextBold() {
        Typeface typeface;
        TextView textView = this.asBinder;
        if (textView == null || (typeface = this.isConnected) == null) {
            return;
        }
        textView.setTypeface(typeface, 1);
    }

    public void setTextColor(int i) {
        this.getInterfaceDescriptor = i;
        TextView textView = this.asBinder;
        if (textView == null) {
            b();
        } else {
            textView.setTextColor(i);
        }
    }

    public void setTextGravity(int i) {
        this.INotificationSideChannelStubProxy = i;
        TextView textView = this.asBinder;
        if (textView != null) {
            textView.setGravity(i);
        }
    }

    public void setTextSize(int i) {
        float f = i;
        this.RemoteActionCompatParcelizer = MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), f);
        TextView textView = this.asBinder;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setUsingSystemFont(boolean z) {
        this.asInterface = z;
    }

    public void setIconResource(Drawable drawable) {
        this.write = drawable;
        ImageView imageView = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (imageView != null && this.TuitionPaymentFragmentbindingInflater1 == null) {
            imageView.setImageDrawable(drawable);
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = null;
            b();
        }
    }

    public void setIconResource(String str) {
        this.IconCompatParcelizer = str;
        TextView textView = this.TuitionPaymentFragmentbindingInflater1;
        if (textView == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            b();
        } else {
            textView.setText(str);
        }
    }

    public FancyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.INotificationSideChannel = ViewCompat.MEASURED_STATE_MASK;
        this.cancel = 0;
        this.notify = Color.parseColor("#f6f7f9");
        this.cancelAll = Color.parseColor("#bec2c9");
        this.onTransact = Color.parseColor("#dddfe2");
        this.getInterfaceDescriptor = -1;
        this.INotificationSideChannelStub = -1;
        this.RemoteActionCompatParcelizer = MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), 15.0f);
        this.INotificationSideChannelStubProxy = 17;
        this.INotificationSideChannelDefault = null;
        this.write = null;
        this.MediaBrowserCompat = MediaBrowserCompatConnectionCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), 15.0f);
        this.IconCompatParcelizer = null;
        this.connect = 1;
        this.read = 10;
        this.getItem = 10;
        this.getNotifyChildrenChangedOptions = 0;
        this.disconnect = 0;
        this.getRoot = 0;
        this.getExtras = 0;
        this.search = 0;
        this.getSessionToken = true;
        this.sendCustomAction = false;
        this.isConnected = null;
        this.getServiceComponent = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "fontawesome.ttf";
        this.b = "robotoregular.ttf";
        this.d = false;
        this.asInterface = false;
        this.f856a = true;
        this.g = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0, 0);
        this.INotificationSideChannel = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancelAll, this.INotificationSideChannel);
        this.cancel = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub, this.cancel);
        this.notify = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cancel, this.notify);
        this.getSessionToken = typedArrayObtainStyledAttributes.getBoolean(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder, true);
        this.cancelAll = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.notify, this.cancelAll);
        this.onTransact = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel, this.onTransact);
        int color = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSessionToken, this.getInterfaceDescriptor);
        this.getInterfaceDescriptor = color;
        this.INotificationSideChannelStub = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.RemoteActionCompatParcelizer, color);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.search, this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = dimension;
        this.RemoteActionCompatParcelizer = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g, dimension);
        this.INotificationSideChannelStubProxy = typedArrayObtainStyledAttributes.getInt(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isConnected, this.INotificationSideChannelStubProxy);
        this.getRoot = typedArrayObtainStyledAttributes.getColor(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d, this.getRoot);
        this.getExtras = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onTransact, this.getExtras);
        this.search = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.disconnect, this.search);
        this.MediaBrowserCompat = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy, this.MediaBrowserCompat);
        this.read = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write, this.read);
        this.getItem = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer, this.getItem);
        this.getNotifyChildrenChangedOptions = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.MediaBrowserCompat, this.getNotifyChildrenChangedOptions);
        this.disconnect = (int) typedArrayObtainStyledAttributes.getDimension(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.read, this.disconnect);
        this.sendCustomAction = typedArrayObtainStyledAttributes.getBoolean(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getItem, false);
        this.sendCustomAction = typedArrayObtainStyledAttributes.getBoolean(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface, false);
        this.d = typedArrayObtainStyledAttributes.getBoolean(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelDefault, this.d);
        this.asInterface = typedArrayObtainStyledAttributes.getBoolean(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getServiceComponent, this.asInterface);
        String string = typedArrayObtainStyledAttributes.getString(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getNotifyChildrenChangedOptions);
        string = string == null ? typedArrayObtainStyledAttributes.getString(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f343a) : string;
        this.connect = typedArrayObtainStyledAttributes.getInt(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getRoot, this.connect);
        String string2 = typedArrayObtainStyledAttributes.getString(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getInterfaceDescriptor);
        String string3 = typedArrayObtainStyledAttributes.getString(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect);
        String string4 = typedArrayObtainStyledAttributes.getString(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.sendCustomAction);
        try {
            this.write = typedArrayObtainStyledAttributes.getDrawable(areCroppingInDifferentDirection.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getExtras);
        } catch (Exception unused) {
            this.write = null;
        }
        if (string2 != null) {
            this.IconCompatParcelizer = string2;
        }
        if (string != null) {
            this.INotificationSideChannelDefault = this.sendCustomAction ? string.toUpperCase() : string;
        }
        if (!isInEditMode()) {
            if (string3 != null) {
                this.getServiceComponent = MediaBrowserCompatConnectionCallback.b(this.g, string3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                this.getServiceComponent = MediaBrowserCompatConnectionCallback.b(this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
            }
            if (string4 != null) {
                this.isConnected = MediaBrowserCompatConnectionCallback.b(this.g, string4, this.b);
            } else {
                this.isConnected = MediaBrowserCompatConnectionCallback.b(this.g, this.b, null);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        int i = this.connect;
        if (i != 3 && i != 4) {
            setOrientation(0);
        } else {
            setOrientation(1);
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        setGravity(17);
        setClickable(true);
        setFocusable(true);
        if (this.write == null && this.IconCompatParcelizer == null && getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
            setPadding(10, 10, 10, 10);
        }
    }
}
