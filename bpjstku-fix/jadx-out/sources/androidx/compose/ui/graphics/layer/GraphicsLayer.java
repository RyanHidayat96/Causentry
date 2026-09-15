package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 É\u00012\u00020\u0001:\u0002É\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\t*\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0018J!\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020 2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010\u0018J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010\u0018J0\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00028\u00000-H\u0082\b¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0003\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\tH\u0000¢\u0006\u0004\b8\u0010\u0018J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\u0018J\u000f\u0010:\u001a\u00020\tH\u0000¢\u0006\u0004\b:\u0010\u0018J\u000f\u0010;\u001a\u00020\tH\u0000¢\u0006\u0004\b;\u0010\u0018J\u000f\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010\u0018J\u0015\u0010=\u001a\u00020\t2\u0006\u0010\u0003\u001a\u000202¢\u0006\u0004\b=\u0010>J+\u0010B\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020.2\b\b\u0002\u0010\b\u001a\u00020/2\b\b\u0002\u0010\u000f\u001a\u00020?¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020.2\b\b\u0002\u0010\b\u001a\u00020/¢\u0006\u0004\bC\u0010\u000bJ\u0010\u0010F\u001a\u00020EH\u0086@¢\u0006\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR'\u0010P\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR%\u0010R\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0018\u0010S\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010[\u001a\u00020?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u00020U8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010WR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bn\u0010oR$\u0010p\u001a\u00020U2\u0006\u0010\u0003\u001a\u00020U8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bp\u0010W\u001a\u0004\bp\u0010qR$\u0010w\u001a\u00020r2\u0006\u0010\u0003\u001a\u00020r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR*\u0010x\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010Y\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R*\u0010}\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00078\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\b}\u0010Y\u001a\u0004\b~\u0010z\"\u0004\b\u007f\u0010|R)\u0010\u0084\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u0088\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0003\u001a\u00030\u0085\u00018G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010t\"\u0005\b\u0087\u0001\u0010vR/\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010\u0003\u001a\u0005\u0018\u00010\u0089\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R.\u0010\u008f\u0001\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020.8\u0007@GX\u0087\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010Y\u001a\u0005\b\u0090\u0001\u0010z\"\u0005\b\u0091\u0001\u0010|R)\u0010\u0094\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0081\u0001\"\u0006\b\u0093\u0001\u0010\u0083\u0001R)\u0010\u0097\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0095\u0001\u0010\u0081\u0001\"\u0006\b\u0096\u0001\u0010\u0083\u0001R)\u0010\u009a\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0081\u0001\"\u0006\b\u0099\u0001\u0010\u0083\u0001R)\u0010\u009d\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0001\u0010\u0081\u0001\"\u0006\b\u009c\u0001\u0010\u0083\u0001R)\u0010 \u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010\u0081\u0001\"\u0006\b\u009f\u0001\u0010\u0083\u0001R)\u0010£\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010\u0081\u0001\"\u0006\b¢\u0001\u0010\u0083\u0001R)\u0010¦\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¤\u0001\u0010\u0081\u0001\"\u0006\b¥\u0001\u0010\u0083\u0001R)\u0010©\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b§\u0001\u0010\u0081\u0001\"\u0006\b¨\u0001\u0010\u0083\u0001R)\u0010¬\u0001\u001a\u00020?2\u0006\u0010\u0003\u001a\u00020?8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\bª\u0001\u0010\u0081\u0001\"\u0006\b«\u0001\u0010\u0083\u0001R6\u0010\u00ad\u0001\u001a\u00020U2\u0006\u0010\u0003\u001a\u00020U8\u0007@GX\u0086\u000e¢\u0006\u001d\n\u0005\b\u00ad\u0001\u0010W\u0012\u0005\b±\u0001\u0010\u0018\u001a\u0005\b®\u0001\u0010q\"\u0006\b¯\u0001\u0010°\u0001R/\u0010·\u0001\u001a\u0005\u0018\u00010²\u00012\t\u0010\u0003\u001a\u0005\u0018\u00010²\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R\u001b\u0010¸\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0014\u0010¼\u0001\u001a\u00030º\u00018G¢\u0006\u0007\u001a\u0005\b»\u0001\u0010zR\u0014\u0010¾\u0001\u001a\u00030º\u00018G¢\u0006\u0007\u001a\u0005\b½\u0001\u0010zR\u0014\u0010Á\u0001\u001a\u00020]8G¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R)\u0010Å\u0001\u001a\u00030Â\u00012\u0007\u0010\u0003\u001a\u00030Â\u00018G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÃ\u0001\u0010z\"\u0005\bÄ\u0001\u0010|R)\u0010È\u0001\u001a\u00030Â\u00012\u0007\u0010\u0003\u001a\u00030Â\u00018G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\bÆ\u0001\u0010z\"\u0005\bÇ\u0001\u0010|"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "p0", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;)V", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "p1", "", "setPosition-VbeCjmY", "(JJ)V", "setPosition", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "p3", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "record", "recordInternal", "()V", "drawWithChildTracking", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "addSubLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "transformCanvas", "(Landroid/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/Canvas;", "drawForPersistence$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;)V", "recreateDisplayListIfNeeded", "draw$ui_graphics_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "onAddedToParentLayer", "onRemovedFromParentLayer", "Landroid/graphics/RectF;", "obtainPathBounds", "()Landroid/graphics/RectF;", "configureOutlineAndClip", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "resolveOutlinePosition", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Outline;", "updatePathOutline", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Outline;", "obtainAndroidOutline", "()Landroid/graphics/Outline;", "release$ui_graphics_release", "discardContentIfReleasedAndHaveNoParentLayerUsages", "discardDisplayList$ui_graphics_release", "emulateTrimMemory$ui_graphics_release", "resetOutlineParams", "setPathOutline", "(Landroidx/compose/ui/graphics/Path;)V", "", "setRoundRectOutline-TNW_H78", "(JJF)V", "setRoundRectOutline", "setRectOutline-tz77jQw", "setRectOutline", "Landroidx/compose/ui/graphics/ImageBitmap;", "toImageBitmap", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "impl", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "drawBlock", "Lkotlin/jvm/functions/Function1;", "clipDrawBlock", "androidOutline", "Landroid/graphics/Outline;", "", "outlineDirty", "Z", "roundRectOutlineTopLeft", "J", "roundRectOutlineSize", "roundRectCornerRadius", "F", "Landroidx/compose/ui/graphics/Outline;", "internalOutline", "Landroidx/compose/ui/graphics/Outline;", "outlinePath", "Landroidx/compose/ui/graphics/Path;", "roundRectClipPath", "usePathForClip", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "softwareDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "", "parentLayerUsages", "I", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "isReleased", "()Z", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", "compositingStrategy", "topLeft", "getTopLeft-nOcc-ac", "()J", "setTopLeft--gyyYBs", "(J)V", "size", "getSize-YbymL2g", "setSize-ozmzZPI", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getShadowElevation", "setShadowElevation", "shadowElevation", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getRotationZ", "setRotationZ", "rotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "clip", "getClip", "setClip", "(Z)V", "getClip$annotations", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "pathBounds", "Landroid/graphics/RectF;", "", "getLayerId", "layerId", "getOwnerViewId", "ownerViewId", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GraphicsLayer {
    private static final LayerSnapshotImpl SnapshotImpl;
    private static final boolean isRobolectric;
    private Outline androidOutline;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private Function1<? super DrawScope, Unit> drawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }
    };
    private final Function1<DrawScope, Unit> clipDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.drawWithChildTracking(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.this$0;
            int iM4207getIntersectrtfAjoo = ClipOp.INSTANCE.m4207getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo4719getSizeNHjbRc = drawContext.mo4719getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo4721clipPathmtrdDE(path, iM4207getIntersectrtfAjoo);
                graphicsLayer.drawWithChildTracking(drawScope);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
            }
        }

        {
            super(1);
        }
    };
    private boolean outlineDirty = true;
    private long roundRectOutlineTopLeft = Offset.INSTANCE.m3990getZeroF1C5BW0();
    private long roundRectOutlineSize = Size.INSTANCE.m4051getUnspecifiedNHjbRc();
    private final ChildLayerDependenciesTracker childDependenciesTracker = new ChildLayerDependenciesTracker();

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", i = {}, l = {869}, m = "toImageBitmap", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.impl = graphicsLayerImpl;
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.INSTANCE.m7074getZeronOccac();
        this.size = IntSize.INSTANCE.m7111getZeroYbymL2g();
        this.pivotOffset = Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: getImpl$ui_graphics_release, reason: from getter */
    public final GraphicsLayerImpl getImpl() {
        return this.impl;
    }

    /* JADX INFO: renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m4887getCompositingStrategyke2Ky5w() {
        return this.impl.getCompositingStrategy();
    }

    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m4895setCompositingStrategyWpw9cng(int i) {
        if (CompositingStrategy.m4874equalsimpl0(this.impl.getCompositingStrategy(), i)) {
            return;
        }
        this.impl.mo4908setCompositingStrategyWpw9cng(i);
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name and from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    /* JADX INFO: renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m4900setTopLeftgyyYBs(long j) {
        if (IntOffset.m7062equalsimpl0(this.topLeft, j)) {
            return;
        }
        this.topLeft = j;
        m4881setPositionVbeCjmY(j, this.size);
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m4884setSizeozmzZPI(long j) {
        if (IntSize.m7104equalsimpl0(this.size, j)) {
            return;
        }
        this.size = j;
        m4881setPositionVbeCjmY(this.topLeft, j);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    public final void setAlpha(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.setAlpha(f);
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4886getBlendMode0nO6VwU() {
        return this.impl.getBlendMode();
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m4894setBlendModes9anfk8(int i) {
        if (BlendMode.m4128equalsimpl0(this.impl.getBlendMode(), i)) {
            return;
        }
        this.impl.mo4907setBlendModes9anfk8(i);
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m4896setPivotOffsetk4lQ0M(long j) {
        if (Offset.m3971equalsimpl0(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        this.impl.mo4910setPivotOffsetk4lQ0M(j);
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final void setScaleX(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.setScaleX(f);
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final void setScaleY(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.setScaleY(f);
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final void setTranslationX(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.setTranslationX(f);
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final void setTranslationY(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.setTranslationY(f);
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    public final void setShadowElevation(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.setShadowElevation(f);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final void setRotationX(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.setRotationX(f);
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m4883setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.INSTANCE.m3990getZeroF1C5BW0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = Size.INSTANCE.m4051getUnspecifiedNHjbRc();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        graphicsLayer.m4898setRoundRectOutlineTNW_H78(j3, j4, f);
    }

    public final void setRotationY(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.setRotationY(f);
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final void setRotationZ(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.setRotationZ(f);
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m4882setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Offset.INSTANCE.m3990getZeroF1C5BW0();
        }
        if ((i & 2) != 0) {
            j2 = Size.INSTANCE.m4051getUnspecifiedNHjbRc();
        }
        graphicsLayer.m4897setRectOutlinetz77jQw(j, j2);
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final void setCameraDistance(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.setCameraDistance(f);
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.clip = z;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    /* JADX INFO: renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m4881setPositionVbeCjmY(long p0, long p1) {
        this.impl.mo4911setPositionH0pRuoY(IntOffset.m7063getXimpl(p0), IntOffset.m7064getYimpl(p0), p1);
    }

    /* JADX INFO: renamed from: record-mL-hObY, reason: not valid java name */
    public final void m4892recordmLhObY(Density p0, LayoutDirection p1, long p2, Function1<? super DrawScope, Unit> p3) {
        m4884setSizeozmzZPI(p2);
        this.density = p0;
        this.layoutDirection = p1;
        this.drawBlock = p3;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091 A[LOOP:0: B:20:0x005a->B:30:0x0091, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[EDGE_INSN: B:34:0x0094->B:31:0x0094 BREAK  A[LOOP:0: B:20:0x005a->B:30:0x0091], SYNTHETIC] */
    public final void drawWithChildTracking(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        childLayerDependenciesTracker.oldDependency = childLayerDependenciesTracker.dependency;
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.dependenciesSet;
        if (mutableScatterSet != null && mutableScatterSet.isNotEmpty()) {
            MutableScatterSet mutableScatterSetMutableScatterSetOf = childLayerDependenciesTracker.oldDependenciesSet;
            if (mutableScatterSetMutableScatterSetOf == null) {
                mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                childLayerDependenciesTracker.oldDependenciesSet = mutableScatterSetMutableScatterSetOf;
            }
            mutableScatterSetMutableScatterSetOf.addAll(mutableScatterSet);
            mutableScatterSet.clear();
        }
        childLayerDependenciesTracker.trackingInProgress = true;
        this.drawBlock.invoke(drawScope);
        childLayerDependenciesTracker.trackingInProgress = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.oldDependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
        }
        MutableScatterSet mutableScatterSet2 = childLayerDependenciesTracker.oldDependenciesSet;
        if (mutableScatterSet2 == null || !mutableScatterSet2.isNotEmpty()) {
            return;
        }
        MutableScatterSet mutableScatterSet3 = mutableScatterSet2;
        Object[] objArr = mutableScatterSet3.elements;
        long[] jArr = mutableScatterSet3.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        mutableScatterSet2.clear();
    }

    private final void addSubLayer(GraphicsLayer p0) {
        if (this.childDependenciesTracker.onDependencyAdded(p0)) {
            p0.onAddedToParentLayer();
        }
    }

    private final void transformCanvas(Canvas p0) {
        float fM7063getXimpl = IntOffset.m7063getXimpl(this.topLeft);
        float fM7064getYimpl = IntOffset.m7064getYimpl(this.topLeft);
        float fM7063getXimpl2 = IntOffset.m7063getXimpl(this.topLeft);
        float f = (int) (this.size >> 32);
        float fM7064getYimpl2 = IntOffset.m7064getYimpl(this.topLeft);
        float f2 = (int) (this.size & 4294967295L);
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM4886getBlendMode0nO6VwU = m4886getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m4128equalsimpl0(iM4886getBlendMode0nO6VwU, BlendMode.INSTANCE.m4159getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m4874equalsimpl0(m4887getCompositingStrategyke2Ky5w(), CompositingStrategy.INSTANCE.m4880getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo4094setBlendModes9anfk8(iM4886getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            p0.saveLayer(fM7063getXimpl, fM7064getYimpl, fM7063getXimpl2 + f, fM7064getYimpl2 + f2, Paint.getInternalPaint());
        } else {
            p0.save();
        }
        p0.translate(fM7063getXimpl, fM7064getYimpl);
        p0.concat(this.impl.calculateMatrix());
    }

    public final void drawForPersistence$ui_graphics_release(androidx.compose.ui.graphics.Canvas p0) {
        if (AndroidCanvas_androidKt.getNativeCanvas(p0).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(p0);
        }
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    public final void draw$ui_graphics_release(androidx.compose.ui.graphics.Canvas p0, GraphicsLayer p1) {
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z = getShadowElevation() > 0.0f;
        if (z) {
            p0.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(p0);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z2 = !zIsHardwareAccelerated && this.clip;
        if (z2) {
            p0.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.m4191clipRectmtrdDE$default(p0, ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect(), 0, 2, null);
            } else if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((androidx.compose.ui.graphics.Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.m4189clipPathmtrdDE$default(p0, Path, 0, 2, null);
            } else {
                if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.graphics.Canvas.m4189clipPathmtrdDE$default(p0, ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (p1 != null) {
            p1.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(p0).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            this.impl.draw(p0);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas = canvasDrawScope2.getDrawContext().getCanvas();
            long jMo4719getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo4719getSizeNHjbRc();
            GraphicsLayer graphicsLayer = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(p0);
            drawContext.mo4720setSizeuvyYCjk(jM7118toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            p0.save();
            try {
                drawWithChildTracking(canvasDrawScope2);
                p0.restore();
                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
            } catch (Throwable th) {
                p0.restore();
                DrawContext drawContext3 = canvasDrawScope2.getDrawContext();
                drawContext3.setDensity(density2);
                drawContext3.setLayoutDirection(layoutDirection2);
                drawContext3.setCanvas(canvas);
                drawContext3.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer);
                throw th;
            }
        }
        if (z2) {
            p0.restore();
        }
        if (z) {
            p0.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (!this.clip && getShadowElevation() <= 0.0f) {
                this.impl.setClip(false);
                this.impl.mo4909setOutlineO0kMr_c(null, IntSize.INSTANCE.m7111getZeroYbymL2g());
            } else {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (path instanceof AndroidPath) {
                        ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                        Outline outlineUpdatePathOutline = updatePathOutline(path);
                        if (outlineUpdatePathOutline != null) {
                            outlineUpdatePathOutline.setAlpha(getAlpha());
                            outline = outlineUpdatePathOutline;
                        }
                        this.impl.mo4909setOutlineO0kMr_c(outline, IntSize.m7101constructorimpl((4294967295L & ((long) Math.round(rectFObtainPathBounds.height()))) | (((long) Math.round(rectFObtainPathBounds.width())) << 32)));
                        if (this.usePathForClip && this.clip) {
                            this.impl.setClip(false);
                            this.impl.discardDisplayList();
                        } else {
                            this.impl.setClip(this.clip);
                        }
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.INSTANCE.m4052getZeroNHjbRc();
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(this.size);
                    long j = this.roundRectOutlineTopLeft;
                    long j2 = this.roundRectOutlineSize;
                    long j3 = j2 != InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : jM7118toSizeozmzZPI;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 >> 32))), Math.round(Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (4294967295L & j3))), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo4909setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSizeKt.m7114roundToIntSizeuvyYCjk(j3));
                }
            }
        }
        this.outlineDirty = false;
    }

    private final <T> T resolveOutlinePosition(Function2<? super Offset, ? super Size, ? extends T> p0) {
        long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM7118toSizeozmzZPI = j2;
        }
        return p0.invoke(Offset.m3963boximpl(j), Size.m4031boximpl(jM7118toSizeozmzZPI));
    }

    private final Outline updatePathOutline(Path p0) {
        Outline outlineObtainAndroidOutline;
        if (Build.VERSION.SDK_INT > 28 || p0.isConvex()) {
            outlineObtainAndroidOutline = obtainAndroidOutline();
            if (Build.VERSION.SDK_INT >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, p0);
            } else if (p0 instanceof AndroidPath) {
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) p0).getInternalPath());
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
        } else {
            Outline outline = this.androidOutline;
            if (outline != null) {
                outline.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
            outlineObtainAndroidOutline = null;
        }
        this.outlinePath = p0;
        return outlineObtainAndroidOutline;
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            discardDisplayList$ui_graphics_release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a A[LOOP:0: B:10:0x0023->B:20:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[EDGE_INSN: B:25:0x005d->B:21:0x005d BREAK  A[LOOP:0: B:10:0x0023->B:20:0x005a], SYNTHETIC] */
    public final void discardDisplayList$ui_graphics_release() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.dependency;
        if (graphicsLayer != null) {
            graphicsLayer.onRemovedFromParentLayer();
            childLayerDependenciesTracker.dependency = null;
        }
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.dependenciesSet;
        if (mutableScatterSet != null) {
            MutableScatterSet mutableScatterSet2 = mutableScatterSet;
            Object[] objArr = mutableScatterSet2.elements;
            long[] jArr = mutableScatterSet2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((GraphicsLayer) objArr[(i << 3) + i3]).onRemovedFromParentLayer();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            mutableScatterSet.clear();
        }
        this.impl.discardDisplayList();
    }

    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline.Rectangle rectangle;
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            androidx.compose.ui.graphics.Outline.Generic generic = new androidx.compose.ui.graphics.Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM7118toSizeozmzZPI = IntSizeKt.m7118toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM7118toSizeozmzZPI = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM7118toSizeozmzZPI >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jM7118toSizeozmzZPI & 4294967295L));
        float f = this.roundRectCornerRadius;
        if (f <= 0.0f) {
            rectangle = new androidx.compose.ui.graphics.Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        } else {
            rectangle = new androidx.compose.ui.graphics.Outline.Rounded(RoundRectKt.m4028RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m3928constructorimpl((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32))));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.INSTANCE.m4051getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.INSTANCE.m3990getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    public final void setPathOutline(Path p0) {
        resetOutlineParams();
        this.outlinePath = p0;
        configureOutlineAndClip();
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m4898setRoundRectOutlineTNW_H78(long p0, long p1, float p2) {
        if (Offset.m3971equalsimpl0(this.roundRectOutlineTopLeft, p0) && Size.m4039equalsimpl0(this.roundRectOutlineSize, p1) && this.roundRectCornerRadius == p2 && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = p0;
        this.roundRectOutlineSize = p1;
        this.roundRectCornerRadius = p2;
        configureOutlineAndClip();
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m4897setRectOutlinetz77jQw(long p0, long p1) {
        m4898setRoundRectOutlineTNW_H78(p0, p1, 0.0f);
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4885getAmbientShadowColor0d7_KjU() {
        return this.impl.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m4893setAmbientShadowColor8_81llA(long j) {
        if (Color.m4219equalsimpl0(j, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.mo4906setAmbientShadowColor8_81llA(j);
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4890getSpotShadowColor0d7_KjU() {
        return this.impl.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m4899setSpotShadowColor8_81llA(long j) {
        if (Color.m4219equalsimpl0(j, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.mo4912setSpotShadowColor8_81llA(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object toImageBitmap(Continuation<? super ImageBitmap> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object bitmap = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(bitmap);
            LayerSnapshotImpl layerSnapshotImpl = SnapshotImpl;
            anonymousClass1.label = 1;
            bitmap = layerSnapshotImpl.toBitmap(this, anonymousClass1);
            if (bitmap == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(bitmap);
        }
        return AndroidImageBitmap_androidKt.asImageBitmap((Bitmap) bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    static {
        LayerSnapshotV21 layerSnapshotV21;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        boolean zAreEqual = Intrinsics.areEqual(lowerCase, "robolectric");
        isRobolectric = zAreEqual;
        if (!zAreEqual) {
            if (Build.VERSION.SDK_INT >= 28) {
                layerSnapshotV21 = LayerSnapshotV28.INSTANCE;
            } else if (SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable()) {
                layerSnapshotV21 = LayerSnapshotV22.INSTANCE;
            } else {
                layerSnapshotV21 = LayerSnapshotV21.INSTANCE;
            }
        } else {
            layerSnapshotV21 = LayerSnapshotV21.INSTANCE;
        }
        SnapshotImpl = layerSnapshotV21;
    }
}
