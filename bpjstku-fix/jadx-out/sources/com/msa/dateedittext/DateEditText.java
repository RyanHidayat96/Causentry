package com.msa.dateedittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ViewPortBuilder;
import defpackage.isUseCaseActive;
import defpackage.toChildrenConfigsMap$WhenMappings;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002=>B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0016J#\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0011\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\u0015\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010\u000e\u001a\u00020$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0016\u0010\u0014\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0011\u0010&R\"\u0010'\u001a\u00020\u00198\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010*\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00100\u001a\u0004\u0018\u00010/2\b\u0010\u0003\u001a\u0004\u0018\u00010/8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u00106\u001a\u0004\u0018\u00010/2\b\u0010\u0003\u001a\u0004\u0018\u00010/8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u0014\u00109\u001a\u00020\t8\u0002X\u0083D¢\u0006\u0006\n\u0004\b9\u0010&R\u0018\u0010<\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;"}, d2 = {"Lcom/msa/dateedittext/DateEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/res/TypedArray;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/util/AttributeSet;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "", "autoCorrect", "Z", "getAutoCorrect", "()Z", "setAutoCorrect", "(Z)V", "Lcom/msa/dateedittext/DateEditText$DateFormat;", "Lcom/msa/dateedittext/DateEditText$DateFormat;", "Lcom/msa/dateedittext/DateEditText$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Lcom/msa/dateedittext/DateEditText$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Lcom/msa/dateedittext/DateEditText$DividerCharacter;", "Lcom/msa/dateedittext/DateEditText$DividerCharacter;", "I", "helperTextEnabled", "getHelperTextEnabled", "setHelperTextEnabled", "helperTextHighlightedColor", "getHelperTextHighlightedColor", "()I", "setHelperTextHighlightedColor", "(I)V", "Ljava/util/Date;", "maxDate", "Ljava/util/Date;", "getMaxDate", "()Ljava/util/Date;", "setMaxDate", "(Ljava/util/Date;)V", "minDate", "getMinDate", "setMinDate", "g", "d", "Ljava/lang/String;", "a", "DateFormat", "DividerCharacter"}, k = 1, mv = {2, 3, 0})
public final class DateEditText extends TextInputEditText {
    private DividerCharacter TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private DateFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean autoCorrect;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String a;
    private final int g;
    private boolean helperTextEnabled;
    private int helperTextHighlightedColor;
    private Date maxDate;
    private Date minDate;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/msa/dateedittext/DateEditText$DateFormat;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 3, 0})
    public enum DateFormat {
        DDMMyyyy("ddMMyyyy"),
        MMyy("MMyy");

        private final String value;

        DateFormat(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/msa/dateedittext/DateEditText$DividerCharacter;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 3, 0})
    public enum DividerCharacter {
        Minus("-"),
        Slash("/");

        private final String value;

        DividerCharacter(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public final Date getMaxDate() {
        return this.maxDate;
    }

    public final void setMaxDate(Date date) {
        Date date2 = this.minDate;
        if (date2 == null || date == null || date2.compareTo(date) < 0) {
            this.maxDate = date;
            return;
        }
        throw new IllegalArgumentException("min date must be smaller than max date");
    }

    public final Date getMinDate() {
        return this.minDate;
    }

    public final void setMinDate(Date date) {
        Date date2 = this.maxDate;
        if (date == null || date2 == null || date.compareTo(date2) < 0) {
            this.minDate = date;
            return;
        }
        throw new IllegalArgumentException("min date must be smaller than max date");
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final void setAutoCorrect(boolean z) {
        this.autoCorrect = z;
    }

    public final boolean getHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    public final void setHelperTextEnabled(boolean z) {
        this.helperTextEnabled = z;
    }

    public final int getHelperTextHighlightedColor() {
        return this.helperTextHighlightedColor;
    }

    public final void setHelperTextHighlightedColor(int i) {
        this.helperTextHighlightedColor = i;
    }

    public DateEditText(Context context) {
        super(context);
        this.TuitionPaymentFragmentbindingInflater1 = DividerCharacter.Minus;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DateFormat.DDMMyyyy;
        this.helperTextHighlightedColor = -16776961;
        this.b = 2;
        this.g = 5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3((AttributeSet) null);
    }

    public DateEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TuitionPaymentFragmentbindingInflater1 = DividerCharacter.Minus;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DateFormat.DDMMyyyy;
        this.helperTextHighlightedColor = -16776961;
        this.b = 2;
        this.g = 5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(attributeSet);
    }

    public DateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentbindingInflater1 = DividerCharacter.Minus;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DateFormat.DDMMyyyy;
        this.helperTextHighlightedColor = -16776961;
        this.b = 2;
        this.g = 5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(attributeSet);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AttributeSet p0) {
        setGravity(3);
        setCursorVisible(false);
        setOnClickListener(new View.OnClickListener() { // from class: com.msa.dateedittext.DateEditText.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    DateEditText dateEditText = DateEditText.this;
                    Editable text = dateEditText.getText();
                    dateEditText.setSelection(text != null ? text.length() : 0);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        setInputType(2);
        if (p0 == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(p0, isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0, 0);
        Intrinsics.checkExpressionValueIsNotNull(typedArrayObtainStyledAttributes, "");
        b(typedArrayObtainStyledAttributes);
        TuitionPaymentFragmentbindingInflater1(typedArrayObtainStyledAttributes);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(typedArrayObtainStyledAttributes);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(typedArrayObtainStyledAttributes);
        this.autoCorrect = typedArrayObtainStyledAttributes.getBoolean(isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, true);
        this.helperTextEnabled = typedArrayObtainStyledAttributes.getBoolean(isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, false);
        this.helperTextHighlightedColor = typedArrayObtainStyledAttributes.getColor(isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface, -16776961);
        Date date = this.minDate;
        Date date2 = this.maxDate;
        if (date == null || date2 == null || date.compareTo(date2) < 0) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("min date must be smaller than max date");
    }

    private final void TuitionPaymentFragmentbindingInflater1(TypedArray p0) {
        int i = p0.getInt(isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b, 0);
        if (i == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DateFormat.DDMMyyyy;
        } else if (i == 1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DateFormat.MMyy;
        }
        CharSequence hint = getHint();
        if (hint == null || hint.length() == 0) {
            setHint(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    }

    private final void b(TypedArray p0) {
        int i = p0.getInt(isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0);
        if (i == 0) {
            this.TuitionPaymentFragmentbindingInflater1 = DividerCharacter.Slash;
        } else if (i == 1) {
            this.TuitionPaymentFragmentbindingInflater1 = DividerCharacter.Minus;
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TypedArray p0) {
        String string = p0.getString(isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder);
        if (string != null) {
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentbindingInflater1(string);
            try {
                setMaxDate(new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, Locale.getDefault()).parse(string));
            } catch (ParseException unused) {
                throw new IllegalArgumentException("max date must be entered as a format and divider character");
            }
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TypedArray p0) {
        String string = p0.getString(isUseCaseActive.TuitionPaymentFragmentspecialinlinedviewModeldefault1.f1233a);
        if (string != null) {
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentbindingInflater1(string);
            try {
                setMinDate(new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, Locale.getDefault()).parse(string));
            } catch (ParseException unused) {
                throw new IllegalArgumentException("min date must be entered as a format and divider character");
            }
        }
    }

    private final void TuitionPaymentFragmentbindingInflater1(String p0) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DateFormat.MMyy) {
            if (p0.length() != 5) {
                throw new IllegalArgumentException("Invalid date");
            }
            if (p0 != null) {
                String strSubstring = p0.substring(0, 2);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring, "");
                int i = Integer.parseInt(strSubstring);
                if (i > 12 || i <= 0) {
                    throw new IllegalArgumentException("Invalid date");
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DateFormat.DDMMyyyy) {
            if (p0.length() != 10) {
                throw new IllegalArgumentException("Invalid date");
            }
            if (p0 != null) {
                String strSubstring2 = p0.substring(0, 2);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "");
                int i2 = Integer.parseInt(strSubstring2);
                if (p0 != null) {
                    String strSubstring3 = p0.substring(3, 5);
                    Intrinsics.checkExpressionValueIsNotNull(strSubstring3, "");
                    int i3 = Integer.parseInt(strSubstring3);
                    if (p0 != null) {
                        String strSubstring4 = p0.substring(6, 10);
                        Intrinsics.checkExpressionValueIsNotNull(strSubstring4, "");
                        int i4 = Integer.parseInt(strSubstring4);
                        boolean z = (i4 % 100 == 0 && i4 % 400 == 0) ? false : true;
                        if (i3 > 12 || i3 <= 0) {
                            throw new IllegalArgumentException("Invalid date");
                        }
                        if (i2 > 31 || i2 == 0) {
                            throw new IllegalArgumentException("Invalid date");
                        }
                        if (i2 == 31 && (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11)) {
                            throw new IllegalArgumentException("Invalid date");
                        }
                        if (i3 == 2 && i2 == 31) {
                            throw new IllegalArgumentException("Invalid date");
                        }
                        if (i3 == 2 && i2 == 29 && !z) {
                            throw new IllegalArgumentException("Invalid date");
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws ParseException {
            if (DateEditText.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                DateEditText.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                return;
            }
            String strB = DateEditText.b(DateEditText.this, DateEditText.b(DateEditText.this));
            if (DateEditText.this.a == null || i2 >= i3) {
                DateEditText.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3(null, null);
                DateEditText dateEditText = DateEditText.this;
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dateEditText, strB, dateEditText.b, i, i2);
                if (DateEditText.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DateFormat.DDMMyyyy) {
                    DateEditText dateEditText2 = DateEditText.this;
                    strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2(dateEditText2, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, dateEditText2.g, i, i2);
                }
                DateEditText.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                DateEditText.this.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                DateEditText dateEditText3 = DateEditText.this;
                Editable text = dateEditText3.getText();
                dateEditText3.setSelection(text != null ? text.length() : 0);
                DateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DateEditText.this, strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                return;
            }
            DateEditText.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            DateEditText dateEditText4 = DateEditText.this;
            dateEditText4.setText(dateEditText4.a);
            DateEditText dateEditText5 = DateEditText.this;
            Editable text2 = dateEditText5.getText();
            dateEditText5.setSelection(text2 != null ? text2.length() : 0);
            DateEditText.this.a = null;
        }
    }

    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = toChildrenConfigsMap$WhenMappings.$EnumSwitchMapping$0[this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            String value = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (value == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = value.substring(0, 2);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring, "");
            sb.append(strSubstring);
            sb.append(this.TuitionPaymentFragmentbindingInflater1.getValue());
            String value2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (value2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring2 = value2.substring(2, 4);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "");
            sb.append(strSubstring2);
            return sb.toString();
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            String value3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (value3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring3 = value3.substring(0, 2);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring3, "");
            sb2.append(strSubstring3);
            sb2.append(this.TuitionPaymentFragmentbindingInflater1.getValue());
            String value4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (value4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring4 = value4.substring(2, 4);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring4, "");
            sb2.append(strSubstring4);
            sb2.append(this.TuitionPaymentFragmentbindingInflater1.getValue());
            String value5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            if (value5 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring5 = value5.substring(4, 8);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring5, "");
            sb2.append(strSubstring5);
            return sb2.toString();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, String p1) {
        this.a = p1;
        ViewParent parent = getParent();
        Intrinsics.checkExpressionValueIsNotNull(parent, "");
        if (parent.getParent() instanceof TextInputLayout) {
            ViewParent parent2 = getParent();
            Intrinsics.checkExpressionValueIsNotNull(parent2, "");
            ViewParent parent3 = parent2.getParent();
            if (parent3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            }
            TextInputLayout textInputLayout = (TextInputLayout) parent3;
            textInputLayout.setError(p0);
            if (p0 == null) {
                textInputLayout.setErrorEnabled(false);
                return;
            }
            return;
        }
        setError(p0);
    }

    public static final /* synthetic */ String b(DateEditText dateEditText) {
        Editable text = dateEditText.getText();
        if ((text != null ? text.length() : 0) >= (dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DateFormat.DDMMyyyy ? 10 : 5)) {
            String strValueOf = String.valueOf(dateEditText.getText());
            int i = dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != DateFormat.DDMMyyyy ? 5 : 10;
            if (strValueOf == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = strValueOf.substring(0, i);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring, "");
            return strSubstring;
        }
        return String.valueOf(dateEditText.getText());
    }

    public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(DateEditText dateEditText, String str, int i, int i2, int i3) {
        if (str.length() != i) {
            return str;
        }
        if (i3 <= i && i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(dateEditText.TuitionPaymentFragmentbindingInflater1.getValue());
            return sb.toString();
        }
        return StringsKt.dropLast(str, 1);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(DateEditText dateEditText, String str) {
        ViewParent parent = dateEditText.getParent();
        Intrinsics.checkExpressionValueIsNotNull(parent, "");
        if ((parent.getParent() instanceof TextInputLayout) && dateEditText.helperTextEnabled) {
            ViewParent parent2 = dateEditText.getParent();
            Intrinsics.checkExpressionValueIsNotNull(parent2, "");
            ViewParent parent3 = parent2.getParent();
            if (parent3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            }
            TextInputLayout textInputLayout = (TextInputLayout) parent3;
            if (str.length() == 0) {
                textInputLayout.setHelperText(null);
                return;
            }
            textInputLayout.setHelperTextEnabled(true);
            SpannableString spannableString = new SpannableString(dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            spannableString.setSpan(new ForegroundColorSpan(dateEditText.helperTextHighlightedColor), 0, str.length(), 33);
            textInputLayout.setHelperText(spannableString);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    public static final /* synthetic */ String b(DateEditText dateEditText, String str) throws ParseException {
        String strReplace;
        String str2 = "12";
        if (dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != DateFormat.MMyy) {
            if (dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != DateFormat.DDMMyyyy) {
                return str;
            }
            if (str.length() < 2) {
                strReplace = str;
            } else if (str != null) {
                String strSubstring = str.substring(0, 2);
                Intrinsics.checkExpressionValueIsNotNull(strSubstring, "");
                int i = Integer.parseInt(strSubstring);
                if (i <= 31 && i != 0) {
                    strReplace = str;
                } else if (dateEditText.autoCorrect) {
                    strReplace = "31";
                } else {
                    if (str == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String strSubstring2 = str.substring(0, 2);
                    Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "");
                    dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), strSubstring2);
                    strReplace = str;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            if (strReplace.length() >= 5) {
                if (strReplace != null) {
                    String strSubstring3 = strReplace.substring(3, 5);
                    Intrinsics.checkExpressionValueIsNotNull(strSubstring3, "");
                    int i2 = Integer.parseInt(strSubstring3);
                    if (i2 > 12 || i2 == 0) {
                        if (dateEditText.autoCorrect) {
                            strReplace = StringsKt.replace(strReplace, String.valueOf(i2), "12", false);
                        } else if (strReplace != null) {
                            String strSubstring4 = strReplace.substring(0, 5);
                            Intrinsics.checkExpressionValueIsNotNull(strSubstring4, "");
                            dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.d), strSubstring4);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    if (strReplace != null) {
                        String strSubstring5 = strReplace.substring(0, 2);
                        Intrinsics.checkExpressionValueIsNotNull(strSubstring5, "");
                        int i3 = Integer.parseInt(strSubstring5);
                        if (i3 == 31 && (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11)) {
                            if (dateEditText.autoCorrect) {
                                strReplace = StringsKt.replace(strReplace, String.valueOf(i3), "30", false);
                            } else {
                                if (strReplace == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                                String strSubstring6 = strReplace.substring(0, 5);
                                Intrinsics.checkExpressionValueIsNotNull(strSubstring6, "");
                                dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1), strSubstring6);
                            }
                        } else if (i2 == 2 && i3 == 31) {
                            if (dateEditText.autoCorrect) {
                                strReplace = StringsKt.replace(strReplace, String.valueOf(i3), "29", false);
                            } else {
                                if (strReplace == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                                String strSubstring7 = strReplace.substring(0, 5);
                                Intrinsics.checkExpressionValueIsNotNull(strSubstring7, "");
                                dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1), strSubstring7);
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            if (strReplace.length() == 10) {
                if (strReplace != null) {
                    String strSubstring8 = strReplace.substring(6, 10);
                    Intrinsics.checkExpressionValueIsNotNull(strSubstring8, "");
                    int i4 = Integer.parseInt(strSubstring8);
                    Date date = dateEditText.maxDate;
                    if (date != null) {
                        if (date == null) {
                            Intrinsics.throwNpe();
                        }
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        Date date2 = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, Locale.US).parse(str);
                        if (date2 != null && date2.compareTo(date) > 0) {
                            if (!dateEditText.autoCorrect) {
                                dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3), strReplace);
                            } else {
                                strReplace = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, Locale.US).format(date);
                                Intrinsics.checkExpressionValueIsNotNull(strReplace, "");
                            }
                        }
                    }
                    Date date3 = dateEditText.minDate;
                    if (date3 != null) {
                        if (date3 == null) {
                            Intrinsics.throwNpe();
                        }
                        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        Date date4 = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, Locale.US).parse(str);
                        if (date4 != null && date4.compareTo(date3) < 0) {
                            if (!dateEditText.autoCorrect) {
                                dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.b), strReplace);
                            } else {
                                strReplace = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, Locale.US).format(date3);
                                Intrinsics.checkExpressionValueIsNotNull(strReplace, "");
                            }
                        }
                    }
                    if (i4 % 100 != 0 || i4 % 400 != 0) {
                        if (strReplace != null) {
                            String strSubstring9 = strReplace.substring(3, 5);
                            Intrinsics.checkExpressionValueIsNotNull(strSubstring9, "");
                            int i5 = Integer.parseInt(strSubstring9);
                            if (strReplace != null) {
                                String strSubstring10 = strReplace.substring(0, 2);
                                Intrinsics.checkExpressionValueIsNotNull(strSubstring10, "");
                                int i6 = Integer.parseInt(strSubstring10);
                                if (i5 == 2 && i6 >= 28) {
                                    if (dateEditText.autoCorrect) {
                                        return StringsKt.replace(strReplace, String.valueOf(i6), "28", false);
                                    }
                                    dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1), strReplace);
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return strReplace;
        }
        if (str.length() < 2) {
            str2 = str;
        } else if (str != null) {
            String strSubstring11 = str.substring(0, 2);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring11, "");
            int i7 = Integer.parseInt(strSubstring11);
            if (i7 <= 12 && i7 != 0) {
                str2 = str;
            } else if (!dateEditText.autoCorrect) {
                dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.d), String.valueOf(i7));
                str2 = str;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        if (str2.length() == 5) {
            Date date5 = dateEditText.maxDate;
            if (date5 != null) {
                if (date5 == null) {
                    Intrinsics.throwNpe();
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                Date date6 = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault4, Locale.US).parse(str);
                if (date6 != null && date6.compareTo(date5) > 0) {
                    if (!dateEditText.autoCorrect) {
                        dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3), str2);
                    } else {
                        str2 = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault4, Locale.US).format(date5);
                        Intrinsics.checkExpressionValueIsNotNull(str2, "");
                    }
                }
            }
            Date date7 = dateEditText.minDate;
            if (date7 != null) {
                if (date7 == null) {
                    Intrinsics.throwNpe();
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                Date date8 = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault5, Locale.US).parse(str);
                if (date8 != null && date8.compareTo(date7) < 0) {
                    if (!dateEditText.autoCorrect) {
                        dateEditText.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dateEditText.getContext().getString(isUseCaseActive.TuitionPaymentFragmentbindingInflater1.b), str2);
                    } else {
                        String str3 = new SimpleDateFormat(strTuitionPaymentFragmentspecialinlinedviewModeldefault5, Locale.US).format(date7);
                        Intrinsics.checkExpressionValueIsNotNull(str3, "");
                        return str3;
                    }
                }
            }
        }
        return str2;
    }
}
