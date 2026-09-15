package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b \bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0$H\u0007¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001aH\u0007¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b/\u0010.J\u001f\u00100\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b0\u0010*J\u001f\u00101\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b3\u0010.J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b4\u0010.J\u001f\u00105\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b5\u0010.J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b6\u0010.J\u001f\u00107\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b7\u0010.J\u001f\u00108\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b8\u0010*J\u001f\u00109\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b9\u0010.J\u001f\u0010:\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b:\u0010.J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001bH\u0007¢\u0006\u0004\b;\u0010.J\u001f\u0010<\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010#J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b=\u0010*J\u0017\u0010>\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\b@\u0010\u001dJ\u0017\u0010A\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\bC\u0010D"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "p0", "", "p1", "newChild", "(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;", "addChildCount", "(Landroid/view/ViewStructure;I)I", "", "p2", "p3", "p4", "", "setId", "(Landroid/view/ViewStructure;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "p5", "p6", "setDimens", "(Landroid/view/ViewStructure;IIIIII)V", "Landroid/view/autofill/AutofillId;", "getAutofillId", "(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillValue;", "", "isDate", "(Landroid/view/autofill/AutofillValue;)Z", "isList", "isText", "isToggle", "", "setContentDescription", "(Landroid/view/ViewStructure;Ljava/lang/CharSequence;)V", "", "setAutofillHints", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "setAutofillId", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V", "setAutofillType", "(Landroid/view/ViewStructure;I)V", "setAutofillValue", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillValue;)V", "setCheckable", "(Landroid/view/ViewStructure;Z)V", "setChecked", "setChildCount", "setClassName", "(Landroid/view/ViewStructure;Ljava/lang/String;)V", "setClickable", "setDataIsSensitive", "setEnabled", "setFocusable", "setFocused", "setInputType", "setLongClickable", "setOpaque", "setSelected", "setText", "setVisibility", "textValue", "(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;", "booleanValue", "listValue", "(Landroid/view/autofill/AutofillValue;)I", "getAutofillTextValue", "(Ljava/lang/String;)Landroid/view/autofill/AutofillValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutofillApi26Helper {
    public static final int $stable = 0;
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    public final ViewStructure newChild(ViewStructure p0, int p1) {
        return p0.newChild(p1);
    }

    public final int addChildCount(ViewStructure p0, int p1) {
        return p0.addChildCount(p1);
    }

    public final void setId(ViewStructure p0, int p1, String p2, String p3, String p4) {
        p0.setId(p1, p2, p3, p4);
    }

    public final void setDimens(ViewStructure p0, int p1, int p2, int p3, int p4, int p5, int p6) {
        p0.setDimens(p1, p2, p3, p4, p5, p6);
    }

    public final AutofillId getAutofillId(ViewStructure p0) {
        return p0.getAutofillId();
    }

    public final boolean isDate(AutofillValue p0) {
        return p0.isDate();
    }

    public final boolean isList(AutofillValue p0) {
        return p0.isList();
    }

    public final boolean isText(AutofillValue p0) {
        return p0.isText();
    }

    public final boolean isToggle(AutofillValue p0) {
        return p0.isToggle();
    }

    public final void setContentDescription(ViewStructure p0, CharSequence p1) {
        p0.setContentDescription(p1);
    }

    public final void setAutofillHints(ViewStructure p0, String[] p1) {
        p0.setAutofillHints(p1);
    }

    public final void setAutofillId(ViewStructure p0, AutofillId p1, int p2) {
        p0.setAutofillId(p1, p2);
    }

    public final void setAutofillType(ViewStructure p0, int p1) {
        p0.setAutofillType(p1);
    }

    public final void setAutofillValue(ViewStructure p0, AutofillValue p1) {
        p0.setAutofillValue(p1);
    }

    public final void setCheckable(ViewStructure p0, boolean p1) {
        p0.setCheckable(p1);
    }

    public final void setChecked(ViewStructure p0, boolean p1) {
        p0.setChecked(p1);
    }

    public final void setChildCount(ViewStructure p0, int p1) {
        p0.setChildCount(p1);
    }

    public final void setClassName(ViewStructure p0, String p1) {
        p0.setClassName(p1);
    }

    public final void setClickable(ViewStructure p0, boolean p1) {
        p0.setClickable(p1);
    }

    public final void setDataIsSensitive(ViewStructure p0, boolean p1) {
        p0.setDataIsSensitive(p1);
    }

    public final void setEnabled(ViewStructure p0, boolean p1) {
        p0.setEnabled(p1);
    }

    public final void setFocusable(ViewStructure p0, boolean p1) {
        p0.setFocusable(p1);
    }

    public final void setFocused(ViewStructure p0, boolean p1) {
        p0.setFocused(p1);
    }

    public final void setInputType(ViewStructure p0, int p1) {
        p0.setInputType(p1);
    }

    public final void setLongClickable(ViewStructure p0, boolean p1) {
        p0.setLongClickable(p1);
    }

    public final void setOpaque(ViewStructure p0, boolean p1) {
        p0.setOpaque(p1);
    }

    public final void setSelected(ViewStructure p0, boolean p1) {
        p0.setSelected(p1);
    }

    public final void setText(ViewStructure p0, CharSequence p1) {
        p0.setText(p1);
    }

    public final void setVisibility(ViewStructure p0, int p1) {
        p0.setVisibility(p1);
    }

    public final CharSequence textValue(AutofillValue p0) {
        return p0.getTextValue();
    }

    public final boolean booleanValue(AutofillValue p0) {
        return p0.getToggleValue();
    }

    public final int listValue(AutofillValue p0) {
        return p0.getListValue();
    }

    public final AutofillValue getAutofillTextValue(String p0) {
        return AutofillValue.forText(p0);
    }
}
