package defpackage;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class CapabilitiesByQuality {
    private static List<AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1> TuitionPaymentFragmentbindingInflater1;
    private final List<AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final ThreadLocal<TuitionPaymentFragmentspecialinlinedviewModeldefault1> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ThreadLocal<>();
    private final Map<Object, AutoValue_RecordingStats<?>> b = new LinkedHashMap();

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        final List<AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        TuitionPaymentFragmentbindingInflater1 = arrayList;
        arrayList.add(setAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        arrayList.add(getRecordedDurationNanos.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        arrayList.add(AutoValue_VideoSpecBuilder.TuitionPaymentFragmentbindingInflater1);
        arrayList.add(isPersistent.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        arrayList.add(getNumBytesRecorded.TuitionPaymentFragmentbindingInflater1);
    }

    public CapabilitiesByQuality(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        int size = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
        List<AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1> list = TuitionPaymentFragmentbindingInflater1;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        arrayList.addAll(list);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [AutoValue_RecordingStats<T>] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T> AutoValue_RecordingStats<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Type type, Set<? extends Annotation> set, String str) {
        ?? r5;
        AutoValue_RecordingStats<?> autoValue_RecordingStats;
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeTuitionPaymentFragmentbindingInflater1 = checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(checkQualityConstantsOrThrow.b(type));
        Object objAsList = set.isEmpty() ? typeTuitionPaymentFragmentbindingInflater1 : Arrays.asList(typeTuitionPaymentFragmentbindingInflater1, set);
        synchronized (this.b) {
            AutoValue_RecordingStats<T> autoValue_RecordingStats2 = (AutoValue_RecordingStats) this.b.get(objAsList);
            if (autoValue_RecordingStats2 != null) {
                return autoValue_RecordingStats2;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            int size = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
                    if (tuitionPaymentFragmentbindingInflater1.b.equals(objAsList)) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(tuitionPaymentFragmentbindingInflater1);
                        AutoValue_RecordingStats<?> autoValue_RecordingStats3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        r5 = tuitionPaymentFragmentbindingInflater1;
                        if (autoValue_RecordingStats3 == null) {
                            break;
                        }
                        autoValue_RecordingStats = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        break;
                    }
                    i++;
                } else {
                    TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1<>(typeTuitionPaymentFragmentbindingInflater1, str, objAsList);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(tuitionPaymentFragmentbindingInflater2);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(tuitionPaymentFragmentbindingInflater2);
                    r5 = (AutoValue_RecordingStats<T>) null;
                    break;
                }
            }
            if (r5 == 0) {
                r5 = autoValue_RecordingStats;
                try {
                    try {
                        int size2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AutoValue_RecordingStats<T> autoValue_RecordingStats4 = (AutoValue_RecordingStats<T>) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault1(typeTuitionPaymentFragmentbindingInflater1, set, this);
                            if (autoValue_RecordingStats4 != null) {
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getLast().TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_RecordingStats4;
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(true);
                                return autoValue_RecordingStats4;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("No JsonAdapter for ");
                        sb.append(checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(typeTuitionPaymentFragmentbindingInflater1, set));
                        throw new IllegalArgumentException(sb.toString());
                    } catch (IllegalArgumentException e2) {
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            throw e2;
                        }
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() == 1 && tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getFirst().TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                            throw e2;
                        }
                        StringBuilder sb2 = new StringBuilder(e2.getMessage());
                        Iterator<TuitionPaymentFragmentbindingInflater1<?>> itDescendingIterator = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.descendingIterator();
                        while (itDescendingIterator.hasNext()) {
                            TuitionPaymentFragmentbindingInflater1<?> next = itDescendingIterator.next();
                            sb2.append("\nfor ");
                            sb2.append(next.TuitionPaymentFragmentbindingInflater1);
                            if (next.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                sb2.append(' ');
                                sb2.append(next.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        }
                        throw new IllegalArgumentException(sb2.toString(), e2);
                    }
                } catch (Throwable th) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(false);
                    throw th;
                }
            }
            r5 = autoValue_RecordingStats;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(false);
            return (AutoValue_RecordingStats<T>) r5;
        }
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final List<TuitionPaymentFragmentbindingInflater1<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
        final Deque<TuitionPaymentFragmentbindingInflater1<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayDeque();

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        final void TuitionPaymentFragmentbindingInflater1(boolean z) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.removeLast();
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                CapabilitiesByQuality.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                if (z) {
                    synchronized (CapabilitiesByQuality.this.b) {
                        int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
                        for (int i = 0; i < size; i++) {
                            TuitionPaymentFragmentbindingInflater1<?> tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
                            AutoValue_RecordingStats<T> autoValue_RecordingStats = (AutoValue_RecordingStats) CapabilitiesByQuality.this.b.put(tuitionPaymentFragmentbindingInflater1.b, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            if (autoValue_RecordingStats != 0) {
                                tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_RecordingStats;
                                CapabilitiesByQuality.this.b.put(tuitionPaymentFragmentbindingInflater1.b, autoValue_RecordingStats);
                            }
                        }
                    }
                }
            }
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1<T> extends AutoValue_RecordingStats<T> {
        final Type TuitionPaymentFragmentbindingInflater1;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        AutoValue_RecordingStats<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final Object b;

        TuitionPaymentFragmentbindingInflater1(Type type, String str, Object obj) {
            this.TuitionPaymentFragmentbindingInflater1 = type;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.b = obj;
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final T b(JsonReader jsonReader) throws IOException {
            AutoValue_RecordingStats<T> autoValue_RecordingStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (autoValue_RecordingStats == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            return autoValue_RecordingStats.b(jsonReader);
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, T t) throws IOException {
            AutoValue_RecordingStats<T> autoValue_RecordingStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (autoValue_RecordingStats == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            autoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, t);
        }

        public final String toString() {
            AutoValue_RecordingStats<T> autoValue_RecordingStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return autoValue_RecordingStats != null ? autoValue_RecordingStats.toString() : super.toString();
        }
    }
}
