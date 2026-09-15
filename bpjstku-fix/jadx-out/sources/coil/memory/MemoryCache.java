package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.MediaMetadataCompat1;
import defpackage.getRatingType;
import defpackage.getText;
import defpackage.keySet;
import defpackage.putBitmap;
import defpackage.putRating;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface MemoryCache {
    TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Key key);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i);

    void b(Key key, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "key", "", "extras", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getKey", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "copy", "equals", "", "other", "", "hashCode", "", "toString", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements Parcelable {
        private final Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final String b;
        private static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentbindingInflater1(null);

        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Key(String str, Map<String, String> map) {
            this.b = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = map;
        }

        public /* synthetic */ Key(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Key TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Map<String, String> map) {
            return new Key(str, map);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.areEqual(this.b, key.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, key.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Key(key=");
            sb.append(this.b);
            sb.append(", extras=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(')');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.b);
            parcel.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size());
            for (Map.Entry<String, String> entry : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcoil/memory/MemoryCache$Key$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "CREATOR", "Landroid/os/Parcelable$Creator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class TuitionPaymentFragmentbindingInflater1 {
            private TuitionPaymentFragmentbindingInflater1() {
            }

            public /* synthetic */ TuitionPaymentFragmentbindingInflater1(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<Key> {
            b() {
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Intrinsics.checkNotNull(string);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    String string2 = parcel.readString();
                    Intrinsics.checkNotNull(string2);
                    String string3 = parcel.readString();
                    Intrinsics.checkNotNull(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Key[] newArray(int i) {
                return new Key[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017"}, d2 = {"Lcoil/memory/MemoryCache$TuitionPaymentFragmentbindingInflater1;", "", "Landroid/graphics/Bitmap;", "p0", "", "", "p1", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "Landroid/graphics/Bitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Landroid/graphics/Bitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Map;", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final Map<String, Object> TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmap;
            this.TuitionPaymentFragmentbindingInflater1 = map;
        }

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
        public final Bitmap getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public /* synthetic */ TuitionPaymentFragmentbindingInflater1(Bitmap bitmap, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i & 2) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, Object> TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) p0;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Value(bitmap=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(", extras=");
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final class b {
        private double TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean TuitionPaymentFragmentbindingInflater1 = true;
        private boolean b = true;

        public b(Context context) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context);
        }

        public final MemoryCache TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            keySet keyset;
            MediaMetadataCompat1 mediaMetadataCompat1;
            int iB;
            if (this.b) {
                keyset = new putBitmap();
            } else {
                keyset = new keySet();
            }
            if (this.TuitionPaymentFragmentbindingInflater1) {
                double d = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (d > 0.0d) {
                    iB = getRatingType.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, d);
                } else {
                    iB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                if (iB > 0) {
                    mediaMetadataCompat1 = new putRating(iB, keyset);
                } else {
                    mediaMetadataCompat1 = new MediaMetadataCompat1(keyset);
                }
            } else {
                mediaMetadataCompat1 = new MediaMetadataCompat1(keyset);
            }
            return new getText(mediaMetadataCompat1, keyset);
        }
    }
}
