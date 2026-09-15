package androidx.preference;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\t\u001a\u00020\b*\u00020\u00002\u0017\u0010\u0002\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\b*\u00020\u00002\"\u0010\u0002\u001a\u001e\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000f*\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017*\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001c\u0010\u001b\"\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001d*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0016\u0010#\u001a\u00020\f*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/preference/PreferenceGroup;", "Landroidx/preference/Preference;", "p0", "", "contains", "(Landroidx/preference/PreferenceGroup;Landroidx/preference/Preference;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "forEach", "(Landroidx/preference/PreferenceGroup;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "forEachIndexed", "(Landroidx/preference/PreferenceGroup;Lkotlin/jvm/functions/Function2;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "get", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "(Landroidx/preference/PreferenceGroup;I)Landroidx/preference/Preference;", "isEmpty", "(Landroidx/preference/PreferenceGroup;)Z", "isNotEmpty", "", "iterator", "(Landroidx/preference/PreferenceGroup;)Ljava/util/Iterator;", "minusAssign", "(Landroidx/preference/PreferenceGroup;Landroidx/preference/Preference;)V", "plusAssign", "Lkotlin/sequences/Sequence;", "getChildren", "(Landroidx/preference/PreferenceGroup;)Lkotlin/sequences/Sequence;", "children", "getSize", "(Landroidx/preference/PreferenceGroup;)I", "size"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class PreferenceGroupKt {
    public static final <T extends Preference> T get(PreferenceGroup preferenceGroup, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return (T) preferenceGroup.findPreference(charSequence);
    }

    public static final Preference get(PreferenceGroup preferenceGroup, int i) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        Preference preference = preferenceGroup.getPreference(i);
        Intrinsics.checkNotNullExpressionValue(preference, "");
        return preference;
    }

    public static final boolean contains(PreferenceGroup preferenceGroup, Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        Intrinsics.checkNotNullParameter(preference, "");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            if (Intrinsics.areEqual(preferenceGroup.getPreference(i), preference)) {
                return true;
            }
        }
        return false;
    }

    public static final void plusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        Intrinsics.checkNotNullParameter(preference, "");
        preferenceGroup.addPreference(preference);
    }

    public static final void minusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        Intrinsics.checkNotNullParameter(preference, "");
        preferenceGroup.removePreference(preference);
    }

    public static final int getSize(PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        return preferenceGroup.getPreferenceCount();
    }

    public static final void forEach(PreferenceGroup preferenceGroup, Function1<? super Preference, Unit> function1) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            function1.invoke(get(preferenceGroup, i));
        }
    }

    public static final void forEachIndexed(PreferenceGroup preferenceGroup, Function2<? super Integer, ? super Preference, Unit> function2) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            function2.invoke(Integer.valueOf(i), get(preferenceGroup, i));
        }
    }

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupKt$iterator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/preference/PreferenceGroupKt$iterator$1;", "", "Landroidx/preference/Preference;", "", "hasNext", "()Z", "next", "()Landroidx/preference/Preference;", "", "remove", "()V", "", FirebaseAnalytics.Param.INDEX, "I"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Preference>, KMutableIterator {
        final /* synthetic */ PreferenceGroup $this_iterator;
        private int index;

        AnonymousClass1(PreferenceGroup preferenceGroup) {
            this.$this_iterator = preferenceGroup;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.index < this.$this_iterator.getPreferenceCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Preference next() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            Preference preference = preferenceGroup.getPreference(i);
            Intrinsics.checkNotNullExpressionValue(preference, "");
            return preference;
        }

        @Override // java.util.Iterator
        public final void remove() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            preferenceGroup.removePreference(preferenceGroup.getPreference(i));
        }
    }

    public static final Iterator<Preference> iterator(PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        return new AnonymousClass1(preferenceGroup);
    }

    public static final Sequence<Preference> getChildren(final PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        return new Sequence<Preference>() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            public final Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(preferenceGroup);
            }
        };
    }

    public static final boolean isEmpty(PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        return preferenceGroup.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "");
        return preferenceGroup.getPreferenceCount() != 0;
    }
}
