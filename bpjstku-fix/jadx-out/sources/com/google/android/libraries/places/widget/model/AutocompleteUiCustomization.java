package com.google.android.libraries.places.widget.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B1\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "Landroid/os/Parcelable;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "noMatchingResultsMessage", "", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "searchBarHint", "<init>", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;Ljava/lang/String;Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;Ljava/lang/String;)V", "equals", "", "other", "", "hashCode", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Builder", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutocompleteUiCustomization implements Parcelable {
    private final AutocompleteListDensity zza;
    private final String zzb;
    private final AutocompleteUiIcon zzc;
    private final String zzd;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AutocompleteUiCustomization> CREATOR = new zzd();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J \u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Companion;", "", "<init>", "()V", "builder", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "create", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @JvmStatic
        public final AutocompleteUiCustomization create(AutocompleteListDensity listDensity, AutocompleteUiIcon listItemIcon) {
            return new Builder().listDensity(listDensity).listItemIcon(listItemIcon).build();
        }

        private Companion() {
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @JvmStatic
        public final Builder builder() {
            return new Builder();
        }
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteUiCustomization)) {
            return false;
        }
        AutocompleteListDensity zza = getZza();
        String strName = zza != null ? zza.name() : null;
        AutocompleteUiCustomization autocompleteUiCustomization = (AutocompleteUiCustomization) other;
        AutocompleteListDensity zza2 = autocompleteUiCustomization.getZza();
        if (Intrinsics.areEqual(strName, zza2 != null ? zza2.name() : null) && Intrinsics.areEqual(this.zzb, autocompleteUiCustomization.zzb)) {
            AutocompleteUiIcon zzc = getZzc();
            Integer numValueOf = zzc != null ? Integer.valueOf(zzc.getZza()) : null;
            AutocompleteUiIcon zzc2 = autocompleteUiCustomization.getZzc();
            if (Intrinsics.areEqual(numValueOf, zzc2 != null ? Integer.valueOf(zzc2.getZza()) : null) && Intrinsics.areEqual(this.zzd, autocompleteUiCustomization.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AutocompleteListDensity zza = getZza();
        String strName = zza != null ? zza.name() : null;
        int iHashCode = strName != null ? strName.hashCode() : 0;
        String str = this.zzb;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        AutocompleteUiIcon zzc = getZzc();
        Integer numValueOf = zzc != null ? Integer.valueOf(zzc.getZza()) : null;
        int iHashCode3 = numValueOf != null ? numValueOf.hashCode() : 0;
        String str2 = this.zzd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "", "<init>", "()V", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "getListDensity", "()Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "setListDensity", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;)V", "noMatchingResultsMessage", "", "getNoMatchingResultsMessage", "()Ljava/lang/String;", "setNoMatchingResultsMessage", "(Ljava/lang/String;)V", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "getListItemIcon", "()Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "setListItemIcon", "(Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;)V", "searchBarHint", "getSearchBarHint", "setSearchBarHint", "build", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private AutocompleteListDensity zza;
        private AutocompleteUiIcon zzb;

        public final AutocompleteUiCustomization build() {
            return new AutocompleteUiCustomization(this.zza, null, this.zzb, null, null);
        }

        public final Builder listDensity(AutocompleteListDensity listDensity) {
            this.zza = listDensity;
            return this;
        }

        public final Builder listItemIcon(AutocompleteUiIcon listItemIcon) {
            this.zzb = listItemIcon;
            return this;
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = TuitionPaymentFragmentbindingInflater1;
            int i2 = i % 6617753;
            TuitionPaymentFragmentbindingInflater1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            int i3 = (int) Runtime.getRuntime().totalMemory();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            return i3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.green(0) + 46400), 39 - Process.getGidForName(""), 19 - ((Process.getThreadPriority(0) + 20) >> 6), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 37837), ExpandableListView.getPackedPositionType(0L) + 59, 18 - Drawable.resolveOpacity(0, 0), 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        long j = i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 37836), 59 - Color.alpha(0), 18 - Color.red(0), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 2404216522537556445L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = jIdentityHashCode ^ j2;
        long j5 = (((long) (-830)) * 3115036974622229794L) + (((long) 832) * 2404216522537556445L) + (((long) (-831)) * (((j3 | j4) ^ j2) | ((3134505065486343679L | jIdentityHashCode) ^ j2))) + (((long) (-1662)) * (((j3 | 3115036974622229794L) | jIdentityHashCode) ^ j2)) + (((long) 831) * ((j2 ^ (jIdentityHashCode | 2404216522537556445L)) | (((j2 ^ 3115036974622229794L) | j4) ^ j2) | ((3115036974622229794L | jIdentityHashCode) ^ j2)));
        long j6 = j;
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j6 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j6 = j5;
        }
        if (i3 == i) {
            return 0;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ViewConfiguration.getTapTimeout() >> 16)), 39 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 20, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
        }
        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
        Toast.makeText((Context) null, i2 / (((i2 - 1) * i2) % 2), 0).show();
        return 0;
    }

    public /* synthetic */ AutocompleteUiCustomization(AutocompleteListDensity autocompleteListDensity, String str, AutocompleteUiIcon autocompleteUiIcon, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = autocompleteListDensity;
        this.zzb = str;
        this.zzc = autocompleteUiIcon;
        this.zzd = str2;
    }

    @JvmStatic
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    @JvmStatic
    public static final AutocompleteUiCustomization create(AutocompleteListDensity autocompleteListDensity, AutocompleteUiIcon autocompleteUiIcon) {
        return INSTANCE.create(autocompleteListDensity, autocompleteUiIcon);
    }

    /* JADX INFO: renamed from: listDensity, reason: from getter */
    public final AutocompleteListDensity getZza() {
        return this.zza;
    }

    /* JADX INFO: renamed from: listItemIcon, reason: from getter */
    public final AutocompleteUiIcon getZzc() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        AutocompleteListDensity autocompleteListDensity = this.zza;
        if (autocompleteListDensity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autocompleteListDensity.writeToParcel(dest, flags);
        }
        dest.writeString(this.zzb);
        AutocompleteUiIcon autocompleteUiIcon = this.zzc;
        if (autocompleteUiIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autocompleteUiIcon.writeToParcel(dest, flags);
        }
        dest.writeString(this.zzd);
    }

    /* JADX INFO: renamed from: zza, reason: from getter */
    public final String getZzb() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: zzb, reason: from getter */
    public final String getZzd() {
        return this.zzd;
    }
}
