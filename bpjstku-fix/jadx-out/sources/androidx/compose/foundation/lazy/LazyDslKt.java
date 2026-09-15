package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010+\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010,\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010.\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010/\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00104\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00105\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00106\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00107¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LazyDslKt {
    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function1 function2, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = C03281.INSTANCE;
        }
        lazyListScope.items(list.size(), function1 != null ? new C03292(function1, list) : null, new AnonymousClass3(function2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "p0", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03281 extends Lambda implements Function1 {
        public static final C03281 INSTANCE = new C03281();

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(T t) {
            return null;
        }

        public C03281() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03292 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i) {
            return this.$key.invoke((T) this.$items.get(i));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03292(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$key = function1;
            this.$items = list;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i) {
            return this.$contentType.invoke((T) this.$items.get(i));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$contentType = function1;
            this.$items = list;
        }
    }

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function2, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(list.size(), function1 != null ? new C03292(function1, list) : null, new AnonymousClass3(function2, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(function4, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "p0", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        @Override // kotlin.jvm.functions.Function4
        public final /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
            }
            this.$itemContent.invoke(lazyItemScope, (T) this.$items.get(i), composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function2 function3, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(list.size(), function2 != null ? new C03312(function2, list) : null, new C03323(function3, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C03334(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03312 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), (T) this.$items.get(i));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03312(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$key = function2;
            this.$items = list;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03323 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), (T) this.$items.get(i));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03323(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$contentType = function2;
            this.$items = list;
        }
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function3, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(list.size(), function2 != null ? new C03312(function2, list) : null, new C03323(function3, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C03334(function5, list)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "p0", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03334 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        @Override // kotlin.jvm.functions.Function4
        public final /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), (T) this.$items.get(i), composer, Integer.valueOf(i3 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03334(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function1 function2, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = AnonymousClass5.INSTANCE;
        }
        lazyListScope.items(objArr.length, function1 != null ? new AnonymousClass6(function1, objArr) : null, new AnonymousClass7(function2, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(function4, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "p0", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass5 extends Lambda implements Function1 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(T t) {
            return null;
        }

        public AnonymousClass5() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass6 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i) {
            return this.$key.invoke(this.$items[i]);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$key = function1;
            this.$items = tArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items[i]);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$contentType = function1;
            this.$items = tArr;
        }
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function2, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(tArr.length, function1 != null ? new AnonymousClass6(function1, tArr) : null, new AnonymousClass7(function2, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(function4, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "p0", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass8 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        @Override // kotlin.jvm.functions.Function4
        public final /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043393750, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:224)");
            }
            this.$itemContent.invoke(lazyItemScope, this.$items[i], composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function2 function3, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, function2 != null ? new C03356(function2, objArr) : null, new C03367(function3, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C03378(function5, objArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03356 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03356(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$key = function2;
            this.$items = tArr;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03367 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03367(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$contentType = function2;
            this.$items = tArr;
        }
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function3, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(tArr.length, function2 != null ? new C03356(function2, tArr) : null, new C03367(function3, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C03378(function5, tArr)));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "p0", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C03378 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        @Override // kotlin.jvm.functions.Function4
        public final /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
            int i3;
            if ((i2 & 6) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600639390, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:260)");
            }
            this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf(i3 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03378(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0119  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0165  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x021e  */
    /* JADX WARN: Code duplicated, block: B:159:0x022b  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        Alignment.Vertical vertical2;
        int i7;
        FlingBehavior flingBehavior2;
        int i8;
        int i9;
        int i10;
        Modifier.Companion companion;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM995PaddingValues0680j_4;
        boolean z4;
        Arrangement.Horizontal end;
        Alignment.Vertical top;
        FlingBehavior flingBehavior3;
        boolean z5;
        Arrangement arrangement;
        final boolean z6;
        final Arrangement.Horizontal horizontal3;
        final FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1724297413);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i13 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        vertical2 = vertical;
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i14 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 256) != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i10 = 33554432;
                            }
                            i3 |= i10;
                        }
                        if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if ((i2 & 2) != 0) {
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListStateRememberLazyListState = lazyListState;
                                }
                                if (i12 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                z4 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z4) {
                                        end = arrangement.getEnd();
                                    } else {
                                        end = arrangement.getStart();
                                    }
                                    i3 &= -57345;
                                } else {
                                    end = horizontal2;
                                }
                                if (i6 != 0) {
                                    top = Alignment.INSTANCE.getTop();
                                } else {
                                    top = vertical2;
                                }
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                if (i8 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                companion = modifier;
                                lazyListStateRememberLazyListState = lazyListState;
                                z5 = z2;
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                z4 = z3;
                                end = horizontal2;
                                top = vertical2;
                                flingBehavior3 = flingBehavior2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                            }
                            int i15 = i3 >> 3;
                            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i15) | (i15 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z4;
                            horizontal3 = end;
                            flingBehavior4 = flingBehavior3;
                            z7 = z5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyListStateRememberLazyListState = lazyListState;
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            z6 = z3;
                            horizontal3 = horizontal2;
                            top = vertical2;
                            flingBehavior4 = flingBehavior2;
                            z7 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier2 = companion;
                            final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
                            final PaddingValues paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            final Alignment.Vertical vertical3 = top;
                            final boolean z8 = z7;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    LazyDslKt.LazyRow(modifier2, lazyListState2, paddingValues3, z6, horizontal3, vertical3, flingBehavior4, z8, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i16 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i16) | (i16 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i17 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | (i17 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier3 = companion;
                        final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues4 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Vertical vertical4 = top;
                        final boolean z9 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i18) {
                                LazyDslKt.LazyRow(modifier3, lazyListState3, paddingValues4, z6, horizontal3, vertical4, flingBehavior4, z9, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                vertical2 = vertical;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i18 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | (i18 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i19 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (i19 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier4 = companion;
                        final LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues5 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Vertical vertical5 = top;
                        final boolean z10 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i110) {
                                LazyDslKt.LazyRow(modifier4, lazyListState4, paddingValues5, z6, horizontal3, vertical5, flingBehavior4, z10, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 100663296;
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i110 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | (i110 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i111 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | (i111 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = companion;
                    final LazyListState lazyListState5 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues6 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Vertical vertical6 = top;
                    final boolean z11 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i112) {
                            LazyDslKt.LazyRow(modifier5, lazyListState5, paddingValues6, z6, horizontal3, vertical6, flingBehavior4, z11, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i112 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (i112 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i113 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | (i113 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier6 = companion;
                        final LazyListState lazyListState6 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues7 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Vertical vertical7 = top;
                        final boolean z12 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i114) {
                                LazyDslKt.LazyRow(modifier6, lazyListState6, paddingValues7, z6, horizontal3, vertical7, flingBehavior4, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 100663296;
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i114 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | (i114 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i115 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i115) | (i115 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = companion;
                    final LazyListState lazyListState7 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues8 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Vertical vertical8 = top;
                    final boolean z13 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i116) {
                            LazyDslKt.LazyRow(modifier7, lazyListState7, paddingValues8, z6, horizontal3, vertical8, flingBehavior4, z13, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            vertical2 = vertical;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i116 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i116) | (i116 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i117 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i117) | (i117 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier8 = companion;
                    final LazyListState lazyListState8 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues9 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Vertical vertical9 = top;
                    final boolean z14 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i118) {
                            LazyDslKt.LazyRow(modifier8, lazyListState8, paddingValues9, z6, horizontal3, vertical9, flingBehavior4, z14, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 100663296;
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i118 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i118) | (i118 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i119 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i119) | (i119 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier9 = companion;
                final LazyListState lazyListState9 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues10 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Vertical vertical10 = top;
                final boolean z15 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1110) {
                        LazyDslKt.LazyRow(modifier9, lazyListState9, paddingValues10, z6, horizontal3, vertical10, flingBehavior4, z15, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i1110 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1110) | (i1110 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                        }
                        int i1111 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1111) | (i1111 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        horizontal3 = end;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier10 = companion;
                        final LazyListState lazyListState10 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues11 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Vertical vertical11 = top;
                        final boolean z16 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1112) {
                                LazyDslKt.LazyRow(modifier10, lazyListState10, paddingValues11, z6, horizontal3, vertical11, flingBehavior4, z16, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 100663296;
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i1112 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1112) | (i1112 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i1113 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1113) | (i1113 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier11 = companion;
                    final LazyListState lazyListState11 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues12 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Vertical vertical12 = top;
                    final boolean z17 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1114) {
                            LazyDslKt.LazyRow(modifier11, lazyListState11, paddingValues12, z6, horizontal3, vertical12, flingBehavior4, z17, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            vertical2 = vertical;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i1114 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1114) | (i1114 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i1115 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1115) | (i1115 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier12 = companion;
                    final LazyListState lazyListState12 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues13 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Vertical vertical13 = top;
                    final boolean z18 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1116) {
                            LazyDslKt.LazyRow(modifier12, lazyListState12, paddingValues13, z6, horizontal3, vertical13, flingBehavior4, z18, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 100663296;
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i1116 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1116) | (i1116 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i1117 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1117) | (i1117 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier13 = companion;
                final LazyListState lazyListState13 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues14 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Vertical vertical14 = top;
                final boolean z19 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1118) {
                        LazyDslKt.LazyRow(modifier13, lazyListState13, paddingValues14, z6, horizontal3, vertical14, flingBehavior4, z19, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i3 |= i13;
        } else {
            horizontal2 = horizontal;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i1118 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1118) | (i1118 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                    }
                    int i1119 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1119) | (i1119 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    horizontal3 = end;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier14 = companion;
                    final LazyListState lazyListState14 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues15 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Vertical vertical15 = top;
                    final boolean z110 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11110) {
                            LazyDslKt.LazyRow(modifier14, lazyListState14, paddingValues15, z6, horizontal3, vertical15, flingBehavior4, z110, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 100663296;
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i11110 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11110) | (i11110 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i11111 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11111) | (i11111 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier15 = companion;
                final LazyListState lazyListState15 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues16 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Vertical vertical16 = top;
                final boolean z111 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11112) {
                        LazyDslKt.LazyRow(modifier15, lazyListState15, paddingValues16, z6, horizontal3, vertical16, flingBehavior4, z111, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        vertical2 = vertical;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                flingBehavior2 = flingBehavior;
                if (composerStartRestartGroup.changed(flingBehavior2)) {
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i3 |= i14;
        } else {
            flingBehavior2 = flingBehavior;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i2 & 256) != 0) {
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i11112 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11112) | (i11112 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                }
                int i11113 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11113) | (i11113 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                horizontal3 = end;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier16 = companion;
                final LazyListState lazyListState16 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues17 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Vertical vertical17 = top;
                final boolean z112 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11114) {
                        LazyDslKt.LazyRow(modifier16, lazyListState16, paddingValues17, z6, horizontal3, vertical17, flingBehavior4, z112, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 100663296;
        if ((i3 & 38347923) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            } else {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
            }
            int i11114 = i3 >> 3;
            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11114) | (i11114 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z4;
            horizontal3 = end;
            flingBehavior4 = flingBehavior3;
            z7 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            } else {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
            }
            int i11115 = i3 >> 3;
            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, end, function1, composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11115) | (i11115 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z4;
            horizontal3 = end;
            flingBehavior4 = flingBehavior3;
            z7 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier17 = companion;
            final LazyListState lazyListState17 = lazyListStateRememberLazyListState;
            final PaddingValues paddingValues18 = paddingValuesM995PaddingValues0680j_4;
            final Alignment.Vertical vertical18 = top;
            final boolean z113 = z7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11116) {
                    LazyDslKt.LazyRow(modifier17, lazyListState17, paddingValues18, z6, horizontal3, vertical18, flingBehavior4, z113, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0119  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0165  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x0194  */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:155:0x0221  */
    /* JADX WARN: Code duplicated, block: B:159:0x022e  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x0108  */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        int i5;
        Arrangement.Vertical vertical2;
        int i6;
        Alignment.Horizontal horizontal2;
        int i7;
        FlingBehavior flingBehavior2;
        int i8;
        int i9;
        int i10;
        Modifier.Companion companion;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM995PaddingValues0680j_4;
        boolean z4;
        Arrangement.Vertical bottom;
        Alignment.Horizontal start;
        FlingBehavior flingBehavior3;
        boolean z5;
        Arrangement arrangement;
        final boolean z6;
        final Arrangement.Vertical vertical3;
        final FlingBehavior flingBehavior4;
        boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-740714857);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i13 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        horizontal2 = horizontal;
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i14 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i2 & 256) != 0) {
                        if ((i & 100663296) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i10 = 33554432;
                            }
                            i3 |= i10;
                        }
                        if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if ((i2 & 2) != 0) {
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListStateRememberLazyListState = lazyListState;
                                }
                                if (i12 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                } else {
                                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                }
                                z4 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z4) {
                                        bottom = arrangement.getBottom();
                                    } else {
                                        bottom = arrangement.getTop();
                                    }
                                    i3 &= -57345;
                                } else {
                                    bottom = vertical2;
                                }
                                if (i6 != 0) {
                                    start = Alignment.INSTANCE.getStart();
                                } else {
                                    start = horizontal2;
                                }
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                if (i8 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                companion = modifier;
                                lazyListStateRememberLazyListState = lazyListState;
                                z5 = z2;
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                                z4 = z3;
                                bottom = vertical2;
                                start = horizontal2;
                                flingBehavior3 = flingBehavior2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                            }
                            int i15 = i3 >> 3;
                            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i15 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i15) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z4;
                            vertical3 = bottom;
                            flingBehavior4 = flingBehavior3;
                            z7 = z5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyListStateRememberLazyListState = lazyListState;
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            z6 = z3;
                            vertical3 = vertical2;
                            start = horizontal2;
                            flingBehavior4 = flingBehavior2;
                            z7 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier2 = companion;
                            final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
                            final PaddingValues paddingValues3 = paddingValuesM995PaddingValues0680j_4;
                            final Alignment.Horizontal horizontal3 = start;
                            final boolean z8 = z7;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    LazyDslKt.LazyColumn(modifier2, lazyListState2, paddingValues3, z6, vertical3, horizontal3, flingBehavior4, z8, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 100663296;
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i16 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i16 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i16) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i17 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i17 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier3 = companion;
                        final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues4 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Horizontal horizontal4 = start;
                        final boolean z9 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i18) {
                                LazyDslKt.LazyColumn(modifier3, lazyListState3, paddingValues4, z6, vertical3, horizontal4, flingBehavior4, z9, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                horizontal2 = horizontal;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i18 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i18 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i19 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i19 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier4 = companion;
                        final LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues5 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Horizontal horizontal5 = start;
                        final boolean z10 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i110) {
                                LazyDslKt.LazyColumn(modifier4, lazyListState4, paddingValues5, z6, vertical3, horizontal5, flingBehavior4, z10, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 100663296;
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i110 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i110 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i111 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i111 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = companion;
                    final LazyListState lazyListState5 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues6 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Horizontal horizontal6 = start;
                    final boolean z11 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i112) {
                            LazyDslKt.LazyColumn(modifier5, lazyListState5, paddingValues6, z6, vertical3, horizontal6, flingBehavior4, z11, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z3 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i112 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i112 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i113 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i113 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier6 = companion;
                        final LazyListState lazyListState6 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues7 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Horizontal horizontal7 = start;
                        final boolean z12 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i114) {
                                LazyDslKt.LazyColumn(modifier6, lazyListState6, paddingValues7, z6, vertical3, horizontal7, flingBehavior4, z12, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 100663296;
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i114 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i114 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i115 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i115 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i115) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = companion;
                    final LazyListState lazyListState7 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues8 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Horizontal horizontal8 = start;
                    final boolean z13 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i116) {
                            LazyDslKt.LazyColumn(modifier7, lazyListState7, paddingValues8, z6, vertical3, horizontal8, flingBehavior4, z13, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            horizontal2 = horizontal;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i116 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i116 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i116) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i117 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i117 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i117) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier8 = companion;
                    final LazyListState lazyListState8 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues9 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Horizontal horizontal9 = start;
                    final boolean z14 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i118) {
                            LazyDslKt.LazyColumn(modifier8, lazyListState8, paddingValues9, z6, vertical3, horizontal9, flingBehavior4, z14, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 100663296;
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i118 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i118 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i118) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i119 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i119 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i119) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier9 = companion;
                final LazyListState lazyListState9 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues10 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Horizontal horizontal10 = start;
                final boolean z15 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1110) {
                        LazyDslKt.LazyColumn(modifier9, lazyListState9, paddingValues10, z6, vertical3, horizontal10, flingBehavior4, z15, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i1110 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1110 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1110) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        } else {
                            if (i11 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            } else {
                                paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior3 = flingBehavior2;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                        }
                        int i1111 = i3 >> 3;
                        LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1111 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1111) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z4;
                        vertical3 = bottom;
                        flingBehavior4 = flingBehavior3;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier10 = companion;
                        final LazyListState lazyListState10 = lazyListStateRememberLazyListState;
                        final PaddingValues paddingValues11 = paddingValuesM995PaddingValues0680j_4;
                        final Alignment.Horizontal horizontal11 = start;
                        final boolean z16 = z7;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1112) {
                                LazyDslKt.LazyColumn(modifier10, lazyListState10, paddingValues11, z6, vertical3, horizontal11, flingBehavior4, z16, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 100663296;
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i1112 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1112 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1112) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i1113 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1113 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1113) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier11 = companion;
                    final LazyListState lazyListState11 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues12 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Horizontal horizontal12 = start;
                    final boolean z17 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1114) {
                            LazyDslKt.LazyColumn(modifier11, lazyListState11, paddingValues12, z6, vertical3, horizontal12, flingBehavior4, z17, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            horizontal2 = horizontal;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i1114 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1114 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1114) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i1115 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1115 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1115) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier12 = companion;
                    final LazyListState lazyListState12 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues13 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Horizontal horizontal13 = start;
                    final boolean z18 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1116) {
                            LazyDslKt.LazyColumn(modifier12, lazyListState12, paddingValues13, z6, vertical3, horizontal13, flingBehavior4, z18, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 100663296;
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i1116 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1116 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1116) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i1117 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1117 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1117) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier13 = companion;
                final LazyListState lazyListState13 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues14 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Horizontal horizontal14 = start;
                final boolean z19 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1118) {
                        LazyDslKt.LazyColumn(modifier13, lazyListState13, paddingValues14, z6, vertical3, horizontal14, flingBehavior4, z19, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i3 |= i13;
        } else {
            vertical2 = vertical;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i3 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i1118 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1118 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1118) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        } else {
                            paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior3 = flingBehavior2;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                    }
                    int i1119 = i3 >> 3;
                    LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i1119 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1119) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z4;
                    vertical3 = bottom;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier14 = companion;
                    final LazyListState lazyListState14 = lazyListStateRememberLazyListState;
                    final PaddingValues paddingValues15 = paddingValuesM995PaddingValues0680j_4;
                    final Alignment.Horizontal horizontal15 = start;
                    final boolean z110 = z7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11110) {
                            LazyDslKt.LazyColumn(modifier14, lazyListState14, paddingValues15, z6, vertical3, horizontal15, flingBehavior4, z110, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 100663296;
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i11110 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i11110 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11110) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i11111 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i11111 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11111) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier15 = companion;
                final LazyListState lazyListState15 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues16 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Horizontal horizontal16 = start;
                final boolean z111 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11112) {
                        LazyDslKt.LazyColumn(modifier15, lazyListState15, paddingValues16, z6, vertical3, horizontal16, flingBehavior4, z111, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        horizontal2 = horizontal;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                flingBehavior2 = flingBehavior;
                if (composerStartRestartGroup.changed(flingBehavior2)) {
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i3 |= i14;
        } else {
            flingBehavior2 = flingBehavior;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i2 & 256) != 0) {
            if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((i3 & 38347923) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i11112 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i11112 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11112) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    } else {
                        paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior3 = flingBehavior2;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                }
                int i11113 = i3 >> 3;
                LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i11113 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11113) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z6 = z4;
                vertical3 = bottom;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier16 = companion;
                final LazyListState lazyListState16 = lazyListStateRememberLazyListState;
                final PaddingValues paddingValues17 = paddingValuesM995PaddingValues0680j_4;
                final Alignment.Horizontal horizontal17 = start;
                final boolean z112 = z7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11114) {
                        LazyDslKt.LazyColumn(modifier16, lazyListState16, paddingValues17, z6, vertical3, horizontal17, flingBehavior4, z112, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 100663296;
        if ((i3 & 38347923) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            } else {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
            }
            int i11114 = i3 >> 3;
            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i11114 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11114) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z4;
            vertical3 = bottom;
            flingBehavior4 = flingBehavior3;
            z7 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            } else {
                if (i11 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                } else {
                    paddingValuesM995PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior3 = flingBehavior2;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
            }
            int i11115 = i3 >> 3;
            LazyListKt.LazyList(companion, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, bottom, null, null, function1, composerStartRestartGroup, (i11115 & 3670016) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11115) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z6 = z4;
            vertical3 = bottom;
            flingBehavior4 = flingBehavior3;
            z7 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier17 = companion;
            final LazyListState lazyListState17 = lazyListStateRememberLazyListState;
            final PaddingValues paddingValues18 = paddingValuesM995PaddingValues0680j_4;
            final Alignment.Horizontal horizontal18 = start;
            final boolean z113 = z7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11116) {
                    LazyDslKt.LazyColumn(modifier17, lazyListState17, paddingValues18, z6, vertical3, horizontal18, flingBehavior4, z113, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0134 A[PHI: r4 r5 r7 r11 r12 r14 r23
  0x0134: PHI (r4v26 int) = (r4v19 int), (r4v28 int), (r4v29 int) binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r5v6 androidx.compose.foundation.lazy.LazyListState) = 
  (r5v3 androidx.compose.foundation.lazy.LazyListState)
  (r5v2 androidx.compose.foundation.lazy.LazyListState)
  (r5v2 androidx.compose.foundation.lazy.LazyListState)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r7v7 androidx.compose.foundation.layout.PaddingValues) = 
  (r7v3 androidx.compose.foundation.layout.PaddingValues)
  (r7v2 androidx.compose.foundation.layout.PaddingValues)
  (r7v2 androidx.compose.foundation.layout.PaddingValues)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r11v8 boolean) = (r11v3 boolean), (r11v2 boolean), (r11v2 boolean) binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r12v22 androidx.compose.foundation.layout.Arrangement$Vertical) = 
  (r12v7 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r12v6 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r12v6 androidx.compose.foundation.layout.Arrangement$Vertical)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r14v8 androidx.compose.ui.Alignment$Horizontal) = 
  (r14v4 androidx.compose.ui.Alignment$Horizontal)
  (r14v3 androidx.compose.ui.Alignment$Horizontal)
  (r14v3 androidx.compose.ui.Alignment$Horizontal)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r23v2 androidx.compose.ui.Modifier) = (r23v1 androidx.compose.ui.Modifier), (r23v0 androidx.compose.ui.Modifier), (r23v0 androidx.compose.ui.Modifier) binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:134:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM995PaddingValues0680j_4;
        int i4;
        boolean z2;
        int i5;
        Arrangement.Vertical vertical2;
        int i6;
        Alignment.Horizontal start;
        int i7;
        FlingBehavior flingBehavior2;
        int i8;
        Modifier.Companion companion;
        FlingBehavior flingBehavior3;
        boolean z3;
        final Alignment.Horizontal horizontal2;
        Modifier modifier2;
        Arrangement arrangement;
        Arrangement.Vertical bottom;
        int i9;
        final PaddingValues paddingValues2;
        final FlingBehavior flingBehavior4;
        final boolean z4;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-563353797);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i11 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i11;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i11;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                paddingValuesM995PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM995PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i13 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        start = horizontal;
                        if (composerStartRestartGroup.changed(start)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i14 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i2 & 128) != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i8 = 8388608;
                            } else {
                                i8 = 4194304;
                            }
                            i3 |= i8;
                        }
                        if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                            } else {
                                if (i10 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                modifier = companion;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                }
                                if (i12 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                }
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z2) {
                                        bottom = arrangement.getBottom();
                                    } else {
                                        bottom = arrangement.getTop();
                                    }
                                    vertical2 = bottom;
                                    i3 &= -57345;
                                }
                                if (i6 != 0) {
                                    start = Alignment.INSTANCE.getStart();
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    z3 = z2;
                                    horizontal2 = start;
                                    modifier2 = modifier;
                                }
                                i9 = i3;
                                Arrangement.Vertical vertical3 = vertical2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                                }
                                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical3, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                vertical2 = vertical3;
                                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                                flingBehavior4 = flingBehavior3;
                                z4 = z3;
                                modifier3 = modifier2;
                            }
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                            i9 = i3;
                            Arrangement.Vertical vertical4 = vertical2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                            }
                            LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical4, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical2 = vertical4;
                            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior4 = flingBehavior3;
                            z4 = z3;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                            z4 = z2;
                            horizontal2 = start;
                            flingBehavior4 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
                            final Arrangement.Vertical vertical5 = vertical2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i15) {
                                    LazyDslKt.LazyColumn(modifier4, lazyListState2, paddingValues2, z4, vertical5, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical6 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical6, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical6;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical7 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical7, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical7;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier5 = modifier3;
                        final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                        final Arrangement.Vertical vertical8 = vertical2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyColumn(modifier5, lazyListState3, paddingValues2, z4, vertical8, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                start = horizontal;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical9 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical9, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical9;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical10 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical10, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical10;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier6 = modifier3;
                        final LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                        final Arrangement.Vertical vertical11 = vertical2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyColumn(modifier6, lazyListState4, paddingValues2, z4, vertical11, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical12 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical12, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical12;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical13 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical13, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical13;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = modifier3;
                    final LazyListState lazyListState5 = lazyListStateRememberLazyListState;
                    final Arrangement.Vertical vertical14 = vertical2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyColumn(modifier7, lazyListState5, paddingValues2, z4, vertical14, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    start = horizontal;
                    if (composerStartRestartGroup.changed(start)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical15 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical15, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical15;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical16 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical16, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical16;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier8 = modifier3;
                        final LazyListState lazyListState6 = lazyListStateRememberLazyListState;
                        final Arrangement.Vertical vertical17 = vertical2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyColumn(modifier8, lazyListState6, paddingValues2, z4, vertical17, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical18 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical18, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical18;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical19 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical19, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical19;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier9 = modifier3;
                    final LazyListState lazyListState7 = lazyListStateRememberLazyListState;
                    final Arrangement.Vertical vertical110 = vertical2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyColumn(modifier9, lazyListState7, paddingValues2, z4, vertical110, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            start = horizontal;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical111 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical111, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical111;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical112 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical112, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical112;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier10 = modifier3;
                    final LazyListState lazyListState8 = lazyListStateRememberLazyListState;
                    final Arrangement.Vertical vertical113 = vertical2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyColumn(modifier10, lazyListState8, paddingValues2, z4, vertical113, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical114 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical114, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical114;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical115 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical115, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical115;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier11 = modifier3;
                final LazyListState lazyListState9 = lazyListStateRememberLazyListState;
                final Arrangement.Vertical vertical116 = vertical2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyColumn(modifier11, lazyListState9, paddingValues2, z4, vertical116, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        paddingValuesM995PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    start = horizontal;
                    if (composerStartRestartGroup.changed(start)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical117 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical117, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical117;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                vertical2 = bottom;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                horizontal2 = start;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                horizontal2 = start;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Vertical vertical118 = vertical2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                        }
                        LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical118, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        vertical2 = vertical118;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier12 = modifier3;
                        final LazyListState lazyListState10 = lazyListStateRememberLazyListState;
                        final Arrangement.Vertical vertical119 = vertical2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyColumn(modifier12, lazyListState10, paddingValues2, z4, vertical119, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical1110 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical1110, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical1110;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical1111 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical1111, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical1111;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier13 = modifier3;
                    final LazyListState lazyListState11 = lazyListStateRememberLazyListState;
                    final Arrangement.Vertical vertical1112 = vertical2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyColumn(modifier13, lazyListState11, paddingValues2, z4, vertical1112, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            start = horizontal;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical1113 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical1113, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical1113;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical1114 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical1114, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical1114;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier14 = modifier3;
                    final LazyListState lazyListState12 = lazyListStateRememberLazyListState;
                    final Arrangement.Vertical vertical1115 = vertical2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyColumn(modifier14, lazyListState12, paddingValues2, z4, vertical1115, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical1116 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical1116, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical1116;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical1117 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical1117, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical1117;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier15 = modifier3;
                final LazyListState lazyListState13 = lazyListStateRememberLazyListState;
                final Arrangement.Vertical vertical1118 = vertical2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyColumn(modifier15, lazyListState13, paddingValues2, z4, vertical1118, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i3 |= i13;
        } else {
            vertical2 = vertical;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                start = horizontal;
                if (composerStartRestartGroup.changed(start)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical1119 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical1119, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical1119;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            vertical2 = bottom;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            horizontal2 = start;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Vertical vertical11110 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                    }
                    LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical11110, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    vertical2 = vertical11110;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier16 = modifier3;
                    final LazyListState lazyListState14 = lazyListStateRememberLazyListState;
                    final Arrangement.Vertical vertical11111 = vertical2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyColumn(modifier16, lazyListState14, paddingValues2, z4, vertical11111, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical11112 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical11112, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical11112;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical11113 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical11113, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical11113;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier17 = modifier3;
                final LazyListState lazyListState15 = lazyListStateRememberLazyListState;
                final Arrangement.Vertical vertical11114 = vertical2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyColumn(modifier17, lazyListState15, paddingValues2, z4, vertical11114, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        start = horizontal;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                flingBehavior2 = flingBehavior;
                if (composerStartRestartGroup.changed(flingBehavior2)) {
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i3 |= i14;
        } else {
            flingBehavior2 = flingBehavior;
        }
        if ((i2 & 128) != 0) {
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical11115 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical11115, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical11115;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        vertical2 = bottom;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        horizontal2 = start;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Vertical vertical11116 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                }
                LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical11116, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                vertical2 = vertical11116;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier18 = modifier3;
                final LazyListState lazyListState16 = lazyListStateRememberLazyListState;
                final Arrangement.Vertical vertical11117 = vertical2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyColumn(modifier18, lazyListState16, paddingValues2, z4, vertical11117, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 12582912;
        if ((i3 & 4793491) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    vertical2 = bottom;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    horizontal2 = start;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                }
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    vertical2 = bottom;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    horizontal2 = start;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                }
            }
            i9 = i3;
            Arrangement.Vertical vertical11118 = vertical2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
            }
            LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical11118, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            vertical2 = vertical11118;
            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            flingBehavior4 = flingBehavior3;
            z4 = z3;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    vertical2 = bottom;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    horizontal2 = start;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                }
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    vertical2 = bottom;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    horizontal2 = start;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                }
            }
            i9 = i3;
            Arrangement.Vertical vertical11119 = vertical2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563353797, i9, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
            }
            LazyColumn(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, vertical11119, horizontal2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            vertical2 = vertical11119;
            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            flingBehavior4 = flingBehavior3;
            z4 = z3;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier19 = modifier3;
            final LazyListState lazyListState17 = lazyListStateRememberLazyListState;
            final Arrangement.Vertical vertical111110 = vertical2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    LazyDslKt.LazyColumn(modifier19, lazyListState17, paddingValues2, z4, vertical111110, horizontal2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0134 A[PHI: r4 r5 r7 r11 r12 r14 r23
  0x0134: PHI (r4v26 int) = (r4v19 int), (r4v28 int), (r4v29 int) binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r5v6 androidx.compose.foundation.lazy.LazyListState) = 
  (r5v3 androidx.compose.foundation.lazy.LazyListState)
  (r5v2 androidx.compose.foundation.lazy.LazyListState)
  (r5v2 androidx.compose.foundation.lazy.LazyListState)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r7v7 androidx.compose.foundation.layout.PaddingValues) = 
  (r7v3 androidx.compose.foundation.layout.PaddingValues)
  (r7v2 androidx.compose.foundation.layout.PaddingValues)
  (r7v2 androidx.compose.foundation.layout.PaddingValues)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r11v8 boolean) = (r11v3 boolean), (r11v2 boolean), (r11v2 boolean) binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r12v22 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
  (r12v7 androidx.compose.foundation.layout.Arrangement$Horizontal)
  (r12v6 androidx.compose.foundation.layout.Arrangement$Horizontal)
  (r12v6 androidx.compose.foundation.layout.Arrangement$Horizontal)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r14v8 androidx.compose.ui.Alignment$Vertical) = 
  (r14v4 androidx.compose.ui.Alignment$Vertical)
  (r14v3 androidx.compose.ui.Alignment$Vertical)
  (r14v3 androidx.compose.ui.Alignment$Vertical)
 binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r23v2 androidx.compose.ui.Modifier) = (r23v1 androidx.compose.ui.Modifier), (r23v0 androidx.compose.ui.Modifier), (r23v0 androidx.compose.ui.Modifier) binds: [B:130:0x0182, B:106:0x012e, B:107:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:131:0x0184  */
    /* JADX WARN: Code duplicated, block: B:134:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM995PaddingValues0680j_4;
        int i4;
        boolean z2;
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        Alignment.Vertical top;
        int i7;
        FlingBehavior flingBehavior2;
        int i8;
        Modifier.Companion companion;
        FlingBehavior flingBehavior3;
        boolean z3;
        final Alignment.Vertical vertical2;
        Modifier modifier2;
        Arrangement arrangement;
        Arrangement.Horizontal end;
        int i9;
        final PaddingValues paddingValues2;
        final FlingBehavior flingBehavior4;
        final boolean z4;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(407929823);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRememberLazyListState = lazyListState;
                int i11 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 32 : 16;
                i3 |= i11;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            i3 |= i11;
        } else {
            lazyListStateRememberLazyListState = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                paddingValuesM995PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM995PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i13 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        top = vertical;
                        if (composerStartRestartGroup.changed(top)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            int i14 = composerStartRestartGroup.changed(flingBehavior2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i2 & 128) != 0) {
                        if ((i & 12582912) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i8 = 8388608;
                            } else {
                                i8 = 4194304;
                            }
                            i3 |= i8;
                        }
                        if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                            } else {
                                if (i10 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                modifier = companion;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                }
                                if (i12 != 0) {
                                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                                }
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z2) {
                                        end = arrangement.getEnd();
                                    } else {
                                        end = arrangement.getStart();
                                    }
                                    horizontal2 = end;
                                    i3 &= -57345;
                                }
                                if (i6 != 0) {
                                    top = Alignment.INSTANCE.getTop();
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    z3 = z2;
                                    vertical2 = top;
                                    modifier2 = modifier;
                                }
                                i9 = i3;
                                Arrangement.Horizontal horizontal3 = horizontal2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                                }
                                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal3, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                horizontal2 = horizontal3;
                                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                                flingBehavior4 = flingBehavior3;
                                z4 = z3;
                                modifier3 = modifier2;
                            }
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                            i9 = i3;
                            Arrangement.Horizontal horizontal4 = horizontal2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                            }
                            LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal4, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            horizontal2 = horizontal4;
                            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                            flingBehavior4 = flingBehavior3;
                            z4 = z3;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                            z4 = z2;
                            vertical2 = top;
                            flingBehavior4 = flingBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
                            final Arrangement.Horizontal horizontal5 = horizontal2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i15) {
                                    LazyDslKt.LazyRow(modifier4, lazyListState2, paddingValues2, z4, horizontal5, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 12582912;
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal6 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal6, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal6;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal7 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal7, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal7;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier5 = modifier3;
                        final LazyListState lazyListState3 = lazyListStateRememberLazyListState;
                        final Arrangement.Horizontal horizontal8 = horizontal2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyRow(modifier5, lazyListState3, paddingValues2, z4, horizontal8, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                top = vertical;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal9 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal9, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal9;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal10 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal10, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal10;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier6 = modifier3;
                        final LazyListState lazyListState4 = lazyListStateRememberLazyListState;
                        final Arrangement.Horizontal horizontal11 = horizontal2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyRow(modifier6, lazyListState4, paddingValues2, z4, horizontal11, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal12 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal12, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal12;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal13 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal13, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal13;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = modifier3;
                    final LazyListState lazyListState5 = lazyListStateRememberLazyListState;
                    final Arrangement.Horizontal horizontal14 = horizontal2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyRow(modifier7, lazyListState5, paddingValues2, z4, horizontal14, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    top = vertical;
                    if (composerStartRestartGroup.changed(top)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal15 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal15, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal15;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal16 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal16, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal16;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier8 = modifier3;
                        final LazyListState lazyListState6 = lazyListStateRememberLazyListState;
                        final Arrangement.Horizontal horizontal17 = horizontal2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyRow(modifier8, lazyListState6, paddingValues2, z4, horizontal17, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal18 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal18, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal18;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal19 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal19, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal19;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier9 = modifier3;
                    final LazyListState lazyListState7 = lazyListStateRememberLazyListState;
                    final Arrangement.Horizontal horizontal110 = horizontal2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyRow(modifier9, lazyListState7, paddingValues2, z4, horizontal110, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            top = vertical;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal111 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal111, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal111;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal112 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal112, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal112;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier10 = modifier3;
                    final LazyListState lazyListState8 = lazyListStateRememberLazyListState;
                    final Arrangement.Horizontal horizontal113 = horizontal2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyRow(modifier10, lazyListState8, paddingValues2, z4, horizontal113, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal114 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal114, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal114;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal115 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal115, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal115;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier11 = modifier3;
                final LazyListState lazyListState9 = lazyListStateRememberLazyListState;
                final Arrangement.Horizontal horizontal116 = horizontal2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyRow(modifier11, lazyListState9, paddingValues2, z4, horizontal116, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        paddingValuesM995PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    top = vertical;
                    if (composerStartRestartGroup.changed(top)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (composerStartRestartGroup.changed(flingBehavior2)) {
                        }
                        i3 |= i14;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal117 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal117, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal117;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        } else {
                            if (i10 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            modifier = companion;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i12 != 0) {
                                paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                horizontal2 = end;
                                i3 &= -57345;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                z3 = z2;
                                vertical2 = top;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                z3 = z2;
                                vertical2 = top;
                                flingBehavior3 = flingBehavior2;
                            }
                        }
                        i9 = i3;
                        Arrangement.Horizontal horizontal118 = horizontal2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                        }
                        LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal118, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontal2 = horizontal118;
                        paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier12 = modifier3;
                        final LazyListState lazyListState10 = lazyListStateRememberLazyListState;
                        final Arrangement.Horizontal horizontal119 = horizontal2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                LazyDslKt.LazyRow(modifier12, lazyListState10, paddingValues2, z4, horizontal119, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 12582912;
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal1110 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal1110, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal1110;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal1111 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal1111, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal1111;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier13 = modifier3;
                    final LazyListState lazyListState11 = lazyListStateRememberLazyListState;
                    final Arrangement.Horizontal horizontal1112 = horizontal2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyRow(modifier13, lazyListState11, paddingValues2, z4, horizontal1112, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            top = vertical;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal1113 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal1113, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal1113;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal1114 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal1114, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal1114;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier14 = modifier3;
                    final LazyListState lazyListState12 = lazyListStateRememberLazyListState;
                    final Arrangement.Horizontal horizontal1115 = horizontal2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyRow(modifier14, lazyListState12, paddingValues2, z4, horizontal1115, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal1116 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal1116, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal1116;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal1117 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal1117, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal1117;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier15 = modifier3;
                final LazyListState lazyListState13 = lazyListStateRememberLazyListState;
                final Arrangement.Horizontal horizontal1118 = horizontal2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyRow(modifier15, lazyListState13, paddingValues2, z4, horizontal1118, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i3 |= i13;
        } else {
            horizontal2 = horizontal;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                top = vertical;
                if (composerStartRestartGroup.changed(top)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    flingBehavior2 = flingBehavior;
                    if (composerStartRestartGroup.changed(flingBehavior2)) {
                    }
                    i3 |= i14;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal1119 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal1119, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal1119;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    } else {
                        if (i10 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        modifier = companion;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        }
                        if (i12 != 0) {
                            paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            horizontal2 = end;
                            i3 &= -57345;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            z3 = z2;
                            vertical2 = top;
                            modifier2 = modifier;
                        } else {
                            modifier2 = modifier;
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                    }
                    i9 = i3;
                    Arrangement.Horizontal horizontal11110 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                    }
                    LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal11110, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal2 = horizontal11110;
                    paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                    flingBehavior4 = flingBehavior3;
                    z4 = z3;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier16 = modifier3;
                    final LazyListState lazyListState14 = lazyListStateRememberLazyListState;
                    final Arrangement.Horizontal horizontal11111 = horizontal2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            LazyDslKt.LazyRow(modifier16, lazyListState14, paddingValues2, z4, horizontal11111, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 12582912;
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal11112 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal11112, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal11112;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal11113 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal11113, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal11113;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier17 = modifier3;
                final LazyListState lazyListState15 = lazyListStateRememberLazyListState;
                final Arrangement.Horizontal horizontal11114 = horizontal2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyRow(modifier17, lazyListState15, paddingValues2, z4, horizontal11114, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        top = vertical;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                flingBehavior2 = flingBehavior;
                if (composerStartRestartGroup.changed(flingBehavior2)) {
                }
                i3 |= i14;
            } else {
                flingBehavior2 = flingBehavior;
            }
            i3 |= i14;
        } else {
            flingBehavior2 = flingBehavior;
        }
        if ((i2 & 128) != 0) {
            if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i3 & 4793491) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal11115 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal11115, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal11115;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    modifier = companion;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if (i12 != 0) {
                        paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        horizontal2 = end;
                        i3 &= -57345;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        z3 = z2;
                        vertical2 = top;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        z3 = z2;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                }
                i9 = i3;
                Arrangement.Horizontal horizontal11116 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                }
                LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal11116, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontal2 = horizontal11116;
                paddingValues2 = paddingValuesM995PaddingValues0680j_4;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier18 = modifier3;
                final LazyListState lazyListState16 = lazyListStateRememberLazyListState;
                final Arrangement.Horizontal horizontal11117 = horizontal2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        LazyDslKt.LazyRow(modifier18, lazyListState16, paddingValues2, z4, horizontal11117, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 12582912;
        if ((i3 & 4793491) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    horizontal2 = end;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    vertical2 = top;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                }
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    horizontal2 = end;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    vertical2 = top;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                }
            }
            i9 = i3;
            Arrangement.Horizontal horizontal11118 = horizontal2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
            }
            LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal11118, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            horizontal2 = horizontal11118;
            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            flingBehavior4 = flingBehavior3;
            z4 = z3;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    horizontal2 = end;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    vertical2 = top;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                }
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                modifier = companion;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                }
                if (i12 != 0) {
                    paddingValuesM995PaddingValues0680j_4 = PaddingKt.m995PaddingValues0680j_4(Dp.m6935constructorimpl(0.0f));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    horizontal2 = end;
                    i3 &= -57345;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    z3 = z2;
                    vertical2 = top;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    z3 = z2;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                }
            }
            i9 = i3;
            Arrangement.Horizontal horizontal11119 = horizontal2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407929823, i9, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
            }
            LazyRow(modifier2, lazyListStateRememberLazyListState, paddingValuesM995PaddingValues0680j_4, z3, horizontal11119, vertical2, flingBehavior3, true, function1, composerStartRestartGroup, (i9 & 14) | 12582912 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | ((i9 << 3) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            horizontal2 = horizontal11119;
            paddingValues2 = paddingValuesM995PaddingValues0680j_4;
            flingBehavior4 = flingBehavior3;
            z4 = z3;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier19 = modifier3;
            final LazyListState lazyListState17 = lazyListStateRememberLazyListState;
            final Arrangement.Horizontal horizontal111110 = horizontal2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    LazyDslKt.LazyRow(modifier19, lazyListState17, paddingValues2, z4, horizontal111110, vertical2, flingBehavior4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(list.size(), function1 != null ? new C03292(function1, list) : null, new AnonymousClass3(C03281.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(list.size(), function2 != null ? new C03312(function2, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C03334(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(objArr.length, function1 != null ? new AnonymousClass6(function1, objArr) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(objArr.length, function2 != null ? new C03356(function2, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C03378(function5, objArr)));
    }
}
