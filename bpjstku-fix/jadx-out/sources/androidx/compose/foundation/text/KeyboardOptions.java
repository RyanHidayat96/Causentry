package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\b\u0007\u0018\u0000 T2\u00020\u0001:\u0001TBS\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0011B=\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0012BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0013J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J^\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b#\u0010\u001fJ\u0019\u0010%\u001a\u00020$2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b(\u0010)R\u001a\u0010.\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010+R\u001d\u00105\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\"R\u0017\u00109\u001a\u00020\u00028CX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b8\u0010\"R\u001c\u0010:\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010=R\u001d\u0010@\u001a\u00020\b8\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u0010\"R\u0017\u0010C\u001a\u00020\b8AX\u0080\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bB\u0010\"R\u0014\u0010D\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010+R\u001d\u0010E\u001a\u00020\u00068\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u0010\"R\u0017\u0010H\u001a\u00020\u00068CX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bG\u0010\"R\u001c\u0010I\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010O\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\bN\u0010-\u001a\u0004\bM\u0010+R\u001c\u0010P\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00100\u001a\u0004\bQ\u00102R\u0014\u0010S\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "p0", "", "p1", "Landroidx/compose/ui/text/input/KeyboardType;", "p2", "Landroidx/compose/ui/text/input/ImeAction;", "p3", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "p4", "p5", "Landroidx/compose/ui/text/intl/LocaleList;", "p6", "<init>", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "copy", "copy-ij11fho", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-INvB4aQ", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "equals", "(Ljava/lang/Object;)Z", "fillUnspecifiedValuesWith$foundation_release", "(Landroidx/compose/foundation/text/KeyboardOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "", "hashCode", "()I", "merge", "Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions$foundation_release", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", "", "toString", "()Ljava/lang/String;", "getAutoCorrect", "()Z", "getAutoCorrect$annotations", "()V", "autoCorrect", "autoCorrectEnabled", "Ljava/lang/Boolean;", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "getAutoCorrectOrDefault", "autoCorrectOrDefault", "capitalization", "I", "getCapitalization-IUNYP9k", "getCapitalizationOrDefault-IUNYP9k", "capitalizationOrDefault", "hintLocales", "Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocalesOrDefault", "hintLocalesOrDefault", "imeAction", "getImeAction-eUduSuo", "getImeActionOrDefault-eUduSuo$foundation_release", "imeActionOrDefault", "isCompletelyUnspecified", "keyboardType", "getKeyboardType-PjHm6EE", "getKeyboardTypeOrDefault-PjHm6EE", "keyboardTypeOrDefault", "platformImeOptions", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "getShouldShowKeyboardOnFocus", "getShouldShowKeyboardOnFocus$annotations", "shouldShowKeyboardOnFocus", "showKeyboardOnFocus", "getShowKeyboardOnFocus", "getShowKeyboardOnFocusOrDefault$foundation_release", "showKeyboardOnFocusOrDefault", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyboardOptions {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardOptions Default;
    private static final KeyboardOptions SecureTextField;
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the autoCorrectEnabled property.")
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    public /* synthetic */ KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m6614getUnspecifiedIUNYP9k() : i, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? KeyboardType.INSTANCE.m6641getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.INSTANCE.m6587getUnspecifiedeUduSuo() : i3, (i4 & 16) != 0 ? null : platformImeOptions, (i4 & 32) != 0 ? null : bool2, (i4 & 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* JADX INFO: renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: getImeAction-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/KeyboardOptions;", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "SecureTextField", "getSecureTextField$foundation_release", "getSecureTextField$foundation_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }

        private Companion() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.SecureTextField;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        Default = new KeyboardOptions(0, (Boolean) null, i, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);
        SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.m6638getPasswordPjHm6EE(), i, (PlatformImeOptions) null, (Boolean) (0 == true ? 1 : 0), (LocaleList) (0 == true ? 1 : 0), 121, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m6614getUnspecifiedIUNYP9k() : i, z, (i4 & 4) != 0 ? KeyboardType.INSTANCE.m6641getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.INSTANCE.m6587getUnspecifiedeUduSuo() : i3, (i4 & 16) != 0 ? null : platformImeOptions, (i4 & 32) != 0 ? null : bool, (i4 & 64) != 0 ? null : localeList, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i, Boolean.valueOf(z), i2, i3, platformImeOptions, bool, localeList, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m6614getUnspecifiedIUNYP9k() : i, (i4 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i4 & 4) != 0 ? KeyboardType.INSTANCE.m6641getUnspecifiedPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.INSTANCE.m6579getDefaulteUduSuo() : i3, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3) {
        this(i, Boolean.valueOf(z), i2, i3, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m6612getNoneIUNYP9k() : i, (i4 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i4 & 4) != 0 ? KeyboardType.INSTANCE.m6640getTextPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.INSTANCE.m6579getDefaulteUduSuo() : i3, (i4 & 16) != 0 ? null : platformImeOptions, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions) {
        this(i, Boolean.valueOf(z), i2, i3, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (DefaultConstructorMarker) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m1325getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM6599boximpl = KeyboardCapitalization.m6599boximpl(this.capitalization);
        if (KeyboardCapitalization.m6602equalsimpl0(keyboardCapitalizationM6599boximpl.getValue(), KeyboardCapitalization.INSTANCE.m6614getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM6599boximpl = null;
        }
        return keyboardCapitalizationM6599boximpl != null ? keyboardCapitalizationM6599boximpl.getValue() : KeyboardCapitalization.INSTANCE.m6612getNoneIUNYP9k();
    }

    /* JADX INFO: renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m1326getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM6616boximpl = KeyboardType.m6616boximpl(this.keyboardType);
        if (KeyboardType.m6619equalsimpl0(keyboardTypeM6616boximpl.getValue(), KeyboardType.INSTANCE.m6641getUnspecifiedPjHm6EE())) {
            keyboardTypeM6616boximpl = null;
        }
        return keyboardTypeM6616boximpl != null ? keyboardTypeM6616boximpl.getValue() : KeyboardType.INSTANCE.m6640getTextPjHm6EE();
    }

    /* JADX INFO: renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m1333getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction imeActionM6563boximpl = ImeAction.m6563boximpl(this.imeAction);
        if (ImeAction.m6566equalsimpl0(imeActionM6563boximpl.getValue(), ImeAction.INSTANCE.m6587getUnspecifiedeUduSuo())) {
            imeActionM6563boximpl = null;
        }
        return imeActionM6563boximpl != null ? imeActionM6563boximpl.getValue() : ImeAction.INSTANCE.m6579getDefaulteUduSuo();
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.getEmpty() : localeList;
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m6602equalsimpl0(this.capitalization, KeyboardCapitalization.INSTANCE.m6614getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m6619equalsimpl0(this.keyboardType, KeyboardType.INSTANCE.m6641getUnspecifiedPjHm6EE()) && ImeAction.m6566equalsimpl0(this.imeAction, ImeAction.INSTANCE.m6587getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ImeOptions.INSTANCE.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z);
    }

    public final ImeOptions toImeOptions$foundation_release(boolean p0) {
        return new ImeOptions(p0, m1325getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m1326getKeyboardTypeOrDefaultPjHm6EE(), m1333getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1322copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        Boolean bool3 = bool;
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        return keyboardOptions.m1328copyINvB4aQ(i, bool3, i5, i6, platformImeOptions, (i4 & 32) != 0 ? null : bool2, (i4 & 64) != 0 ? null : localeList);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m1328copyINvB4aQ(int p0, Boolean p1, int p2, int p3, PlatformImeOptions p4, Boolean p5, LocaleList p6) {
        return new KeyboardOptions(p0, p1, p2, p3, p4, p5, p6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1323copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        if ((i4 & 32) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        Boolean bool2 = bool;
        if ((i4 & 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        return keyboardOptions.m1329copyINvB4aQ(i, z2, i5, i6, platformImeOptions2, bool2, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    /* JADX INFO: renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1329copyINvB4aQ(int p0, boolean p1, int p2, int p3, PlatformImeOptions p4, Boolean p5, LocaleList p6) {
        return new KeyboardOptions(p0, Boolean.valueOf(p1), p2, p3, p4, p5, p6, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1324copyij11fho$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        boolean z2 = z;
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        return keyboardOptions.m1330copyij11fho(i, z2, i5, i6, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1330copyij11fho(int p0, boolean p1, int p2, int p3, PlatformImeOptions p4) {
        return new KeyboardOptions(p0, Boolean.valueOf(p1), p2, p3, p4, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m1321copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m1327copy3m2b7yw(i, z, i2, i3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* JADX INFO: renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m1327copy3m2b7yw(int p0, boolean p1, int p2, int p3) {
        return new KeyboardOptions(p0, Boolean.valueOf(p1), p2, p3, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) p0;
        return KeyboardCapitalization.m6602equalsimpl0(this.capitalization, keyboardOptions.capitalization) && Intrinsics.areEqual(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m6619equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m6566equalsimpl0(this.imeAction, keyboardOptions.imeAction) && Intrinsics.areEqual(this.platformImeOptions, keyboardOptions.platformImeOptions) && Intrinsics.areEqual(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.areEqual(this.hintLocales, keyboardOptions.hintLocales);
    }

    public final int hashCode() {
        int iM6603hashCodeimpl = KeyboardCapitalization.m6603hashCodeimpl(this.capitalization);
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        int iM6620hashCodeimpl = KeyboardType.m6620hashCodeimpl(this.keyboardType);
        int iM6567hashCodeimpl = ImeAction.m6567hashCodeimpl(this.imeAction);
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode2 = platformImeOptions != null ? platformImeOptions.hashCode() : 0;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode3 = bool2 != null ? bool2.hashCode() : 0;
        LocaleList localeList = this.hintLocales;
        return (((((((((((iM6603hashCodeimpl * 31) + iHashCode) * 31) + iM6620hashCodeimpl) * 31) + iM6567hashCodeimpl) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (localeList != null ? localeList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append((Object) KeyboardCapitalization.m6604toStringimpl(this.capitalization));
        sb.append(", autoCorrectEnabled=");
        sb.append(this.autoCorrectEnabled);
        sb.append(", keyboardType=");
        sb.append((Object) KeyboardType.m6621toStringimpl(this.keyboardType));
        sb.append(", imeAction=");
        sb.append((Object) ImeAction.m6568toStringimpl(this.imeAction));
        sb.append(", platformImeOptions=");
        sb.append(this.platformImeOptions);
        sb.append("showKeyboardOnFocus=");
        sb.append(this.showKeyboardOnFocus);
        sb.append(", hintLocales=");
        sb.append(this.hintLocales);
        sb.append(')');
        return sb.toString();
    }

    public final KeyboardOptions merge(KeyboardOptions p0) {
        KeyboardOptions keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
        return (p0 == null || (keyboardOptionsFillUnspecifiedValuesWith$foundation_release = p0.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
    }

    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(KeyboardOptions p0) {
        int value;
        int value2;
        int value3;
        if (p0 == null || p0.isCompletelyUnspecified() || Intrinsics.areEqual(p0, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return p0;
        }
        KeyboardCapitalization keyboardCapitalizationM6599boximpl = KeyboardCapitalization.m6599boximpl(this.capitalization);
        if (KeyboardCapitalization.m6602equalsimpl0(keyboardCapitalizationM6599boximpl.getValue(), KeyboardCapitalization.INSTANCE.m6614getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM6599boximpl = null;
        }
        if (keyboardCapitalizationM6599boximpl != null) {
            value = keyboardCapitalizationM6599boximpl.getValue();
        } else {
            value = p0.capitalization;
        }
        int i = value;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = p0.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeM6616boximpl = KeyboardType.m6616boximpl(this.keyboardType);
        if (KeyboardType.m6619equalsimpl0(keyboardTypeM6616boximpl.getValue(), KeyboardType.INSTANCE.m6641getUnspecifiedPjHm6EE())) {
            keyboardTypeM6616boximpl = null;
        }
        if (keyboardTypeM6616boximpl != null) {
            value2 = keyboardTypeM6616boximpl.getValue();
        } else {
            value2 = p0.keyboardType;
        }
        int i2 = value2;
        ImeAction imeActionM6563boximpl = ImeAction.m6563boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m6566equalsimpl0(imeActionM6563boximpl.getValue(), ImeAction.INSTANCE.m6587getUnspecifiedeUduSuo()) ? null : imeActionM6563boximpl;
        if (imeAction != null) {
            value3 = imeAction.getValue();
        } else {
            value3 = p0.imeAction;
        }
        int i3 = value3;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = p0.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = p0.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        return new KeyboardOptions(i, bool2, i2, i3, platformImeOptions2, bool4, localeList == null ? p0.hintLocales : localeList, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i, Boolean bool, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bool, i2, i3, platformImeOptions, bool2, localeList);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3, platformImeOptions, bool, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, PlatformImeOptions platformImeOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3);
    }
}
