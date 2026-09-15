package androidx.compose.material3;

import androidx.exifinterface.media.ExifInterface;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u000e2\u00020\u000e*\u001e\b\u0000\u0010\u0012\u001a\u0004\b\u0000\u0010\u0010\"\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0012\u0004\u0012\u00028\u00000\u0011"}, d2 = {"", "p0", "p1", "", "p2", "Ljava/text/NumberFormat;", "getCachedDateTimeFormatter", "(IIZ)Ljava/text/NumberFormat;", "", "toLocalString", "(IIIZ)Ljava/lang/String;", "Ljava/util/WeakHashMap;", "cachedFormatters", "Ljava/util/WeakHashMap;", "Ljava/util/Locale;", "b", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/atomic/AtomicReference;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActualJvm_jvmKt {
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    public static /* synthetic */ void InternalAtomicReference$annotations() {
    }

    public static /* synthetic */ String toLocalString$default(int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 1;
        }
        if ((i4 & 2) != 0) {
            i3 = 40;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        return toLocalString(i, i2, i3, z);
    }

    public static final String toLocalString(int i, int i2, int i3, boolean z) {
        return getCachedDateTimeFormatter(i2, i3, z).format(Integer.valueOf(i));
    }

    private static final NumberFormat getCachedDateTimeFormatter(int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('.');
        sb.append(i2);
        sb.append('.');
        sb.append(z);
        sb.append('.');
        sb.append(Locale.getDefault().toLanguageTag());
        String string = sb.toString();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat integerInstance = weakHashMap.get(string);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(z);
            integerInstance.setMinimumIntegerDigits(i);
            integerInstance.setMaximumIntegerDigits(i2);
            weakHashMap.put(string, integerInstance);
        }
        return integerInstance;
    }
}
