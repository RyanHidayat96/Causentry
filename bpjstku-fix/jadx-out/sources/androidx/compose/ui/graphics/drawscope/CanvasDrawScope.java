package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0081\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J[\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJI\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJI\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!JA\u0010%\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$JY\u0010%\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020&2\u0006\u0010\b\u001a\u00020'2\u0006\u0010\n\u001a\u00020&2\u0006\u0010\f\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b(\u0010)Ja\u0010%\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020&2\u0006\u0010\b\u001a\u00020'2\u0006\u0010\n\u001a\u00020&2\u0006\u0010\f\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-JQ\u00101\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020.2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u00100JQ\u00101\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020.2\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u00103JI\u00106\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105JI\u00106\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b7\u00108JI\u0010:\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b9\u0010\u001eJI\u0010:\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u0010!Ja\u0010?\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020<2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u0010>Ja\u0010?\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020<2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b@\u0010AJA\u0010E\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\bC\u0010DJA\u0010E\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0012H\u0016¢\u0006\u0004\bF\u0010GJa\u0010L\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060H2\u0006\u0010\u0007\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\bJ\u0010KJa\u0010L\u001a\u00020\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060H2\u0006\u0010\u0007\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\bM\u0010NJI\u0010V\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020O2\u0006\u0010\u0007\u001a\u00020P2\u0006\u0010\b\u001a\u00020Q2\u0006\u0010\n\u001a\u00020\u001b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140R¢\u0006\u0002\bSH\u0086\b¢\u0006\u0004\bT\u0010UJ\u000f\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020WH\u0002¢\u0006\u0004\bZ\u0010YJ\u0017\u0010[\u001a\u00020W2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b[\u0010\\JE\u0010_\u001a\u00020W2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020*H\u0002¢\u0006\u0004\b]\u0010^JC\u0010_\u001a\u00020W2\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020*H\u0002¢\u0006\u0004\b`\u0010aJe\u0010e\u001a\u00020W2\u0006\u0010\u0005\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\bc\u0010dJg\u0010e\u001a\u00020W2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010j\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\bh\u0010iR \u0010l\u001a\u00020k8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bp\u0010\u0003\u001a\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020P8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010uR\u001a\u0010z\u001a\u00020y8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007f"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "<init>", "()V", "Landroidx/compose/ui/graphics/Brush;", "p0", "Landroidx/compose/ui/geometry/Offset;", "p1", "p2", "", "p3", "Landroidx/compose/ui/graphics/StrokeCap;", "p4", "Landroidx/compose/ui/graphics/PathEffect;", "p5", "p6", "Landroidx/compose/ui/graphics/ColorFilter;", "p7", "Landroidx/compose/ui/graphics/BlendMode;", "p8", "", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "Landroidx/compose/ui/graphics/Color;", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "p9", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "draw", "Landroidx/compose/ui/graphics/Paint;", "obtainFillPaint", "()Landroidx/compose/ui/graphics/Paint;", "obtainStrokePaint", "selectPaint", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/graphics/Paint;", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configurePaint", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/StrokeJoin;", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "modulate-5vOe2sY", "(JF)J", "modulate", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "strokePaint", "DrawParams"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CanvasDrawScope implements DrawScope {
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final Canvas getCanvas() {
            return this.this$0.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setCanvas(Canvas canvas) {
            this.this$0.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long mo4719getSizeNHjbRc() {
            return this.this$0.getDrawParams().m4717getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void mo4720setSizeuvyYCjk(long j) {
            this.this$0.getDrawParams().m4718setSizeuvyYCjk(j);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final LayoutDirection getLayoutDirection() {
            return this.this$0.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.this$0.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final Density getDensity() {
            return this.this$0.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setDensity(Density density) {
            this.this$0.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }
    };

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final DrawContext getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public final void mo4702drawLine1RTmtNc(Brush p0, long p1, long p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.drawParams.getCanvas().mo4074drawLineWko1d7g(p1, p2, m4692configureStrokePaintho4zsrM$default(this, p0, p3, 4.0f, p4, StrokeJoin.INSTANCE.m4600getMiterLxFBmk8(), p5, p6, p7, p8, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public final void mo4703drawLineNGM6Ib0(long p0, long p1, long p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.drawParams.getCanvas().mo4074drawLineWko1d7g(p1, p2, m4690configureStrokePaintQ_0CZUI$default(this, p0, p3, 4.0f, p4, StrokeJoin.INSTANCE.m4600getMiterLxFBmk8(), p5, p6, p7, p8, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w, reason: not valid java name */
    public final void mo4710drawRectAsUm42w(Brush p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p1 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        canvas.drawRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p2 & 4294967295L)), m4688configurePaintswdJneE$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public final void mo4711drawRectnJ9OG0(long p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p1 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        canvas.drawRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p2 & 4294967295L)), m4686configurePaint2qPWKa0$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public final void mo4701drawImagegbVJVH8(ImageBitmap p0, long p1, float p2, DrawStyle p3, ColorFilter p4, int p5) {
        this.drawParams.getCanvas().mo4072drawImaged4ec7I(p0, p1, m4688configurePaintswdJneE$default(this, null, p3, p2, p4, p5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public final /* synthetic */ void mo4699drawImage9jGpkUE(ImageBitmap p0, long p1, long p2, long p3, long p4, float p5, DrawStyle p6, ColorFilter p7, int p8) {
        this.drawParams.getCanvas().mo4073drawImageRectHPBpro0(p0, p1, p2, p3, p4, m4688configurePaintswdJneE$default(this, null, p6, p5, p7, p8, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public final void mo4700drawImageAZ2fEMs(ImageBitmap p0, long p1, long p2, long p3, long p4, float p5, DrawStyle p6, ColorFilter p7, int p8, int p9) {
        this.drawParams.getCanvas().mo4073drawImageRectHPBpro0(p0, p1, p2, p3, p4, m4687configurePaintswdJneE(null, p6, p5, p7, p8, p9));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public final void mo4712drawRoundRectZuiqVtQ(Brush p0, long p1, long p2, long p3, float p4, DrawStyle p5, ColorFilter p6, int p7) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p1 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        canvas.drawRoundRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p2 & 4294967295L)), Float.intBitsToFloat((int) (p3 >> 32)), Float.intBitsToFloat((int) (p3 & 4294967295L)), m4688configurePaintswdJneE$default(this, p0, p5, p4, p6, p7, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public final void mo4713drawRoundRectuAw5IA(long p0, long p1, long p2, long p3, DrawStyle p4, float p5, ColorFilter p6, int p7) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p1 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        canvas.drawRoundRect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p2 & 4294967295L)), Float.intBitsToFloat((int) (p3 >> 32)), Float.intBitsToFloat((int) (p3 & 4294967295L)), m4686configurePaint2qPWKa0$default(this, p0, p4, p5, p6, p7, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public final void mo4697drawCircleV9BoPsw(Brush p0, float p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.drawParams.getCanvas().mo4071drawCircle9KIMszo(p2, p1, m4688configurePaintswdJneE$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public final void mo4698drawCircleVaOC9Bg(long p0, float p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.drawParams.getCanvas().mo4071drawCircle9KIMszo(p2, p1, m4686configurePaint2qPWKa0$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w, reason: not valid java name */
    public final void mo4704drawOvalAsUm42w(Brush p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p1 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        canvas.drawOval(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p2 & 4294967295L)), m4688configurePaintswdJneE$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public final void mo4705drawOvalnJ9OG0(long p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p1 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p1 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p2 >> 32));
        canvas.drawOval(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p2 & 4294967295L)), m4686configurePaint2qPWKa0$default(this, p0, p4, p3, p5, p6, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I, reason: not valid java name */
    public final void mo4695drawArcillE91I(Brush p0, float p1, float p2, boolean p3, long p4, long p5, float p6, DrawStyle p7, ColorFilter p8, int p9) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p4 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p4 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p5 >> 32));
        canvas.drawArc(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p5 & 4294967295L)), p1, p2, p3, m4688configurePaintswdJneE$default(this, p0, p7, p6, p8, p9, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public final void mo4696drawArcyD3GUKo(long p0, float p1, float p2, boolean p3, long p4, long p5, float p6, DrawStyle p7, ColorFilter p8, int p9) {
        Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (p4 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (p4 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (p5 >> 32));
        canvas.drawArc(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3 + fIntBitsToFloat4, Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (p5 & 4294967295L)), p1, p2, p3, m4686configurePaint2qPWKa0$default(this, p0, p7, p6, p8, p9, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI, reason: not valid java name */
    public final void mo4707drawPathLG529CI(Path p0, long p1, float p2, DrawStyle p3, ColorFilter p4, int p5) {
        this.drawParams.getCanvas().drawPath(p0, m4686configurePaint2qPWKa0$default(this, p1, p3, p2, p4, p5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public final void mo4706drawPathGBMwjPU(Path p0, Brush p1, float p2, DrawStyle p3, ColorFilter p4, int p5) {
        this.drawParams.getCanvas().drawPath(p0, m4688configurePaintswdJneE$default(this, p1, p3, p2, p4, p5, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public final void mo4708drawPointsF8ZwMP8(List<Offset> p0, int p1, long p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.drawParams.getCanvas().mo4075drawPointsO7TthRY(p1, p0, m4690configureStrokePaintQ_0CZUI$default(this, p2, p3, 4.0f, p4, StrokeJoin.INSTANCE.m4600getMiterLxFBmk8(), p5, p6, p7, p8, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public final void mo4709drawPointsGsft0Ws(List<Offset> p0, int p1, Brush p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.drawParams.getCanvas().mo4075drawPointsO7TthRY(p1, p0, m4692configureStrokePaintho4zsrM$default(this, p2, p3, 4.0f, p4, StrokeJoin.INSTANCE.m4600getMiterLxFBmk8(), p5, p6, p7, p8, 0, 512, null));
    }

    /* JADX INFO: renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m4694drawyzxVdVo(Density p0, LayoutDirection p1, Canvas p2, long p3, Function1<? super DrawScope, Unit> p4) {
        DrawParams drawParams = getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection = drawParams.getLayoutDirection();
        Canvas canvas = drawParams.getCanvas();
        long size = drawParams.getSize();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(p0);
        drawParams2.setLayoutDirection(p1);
        drawParams2.setCanvas(p2);
        drawParams2.m4718setSizeuvyYCjk(p3);
        p2.save();
        p4.invoke(this);
        p2.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection);
        drawParams3.setCanvas(canvas);
        drawParams3.m4718setSizeuvyYCjk(size);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4099setStylek9PVt8s(PaintingStyle.INSTANCE.m4498getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo4099setStylek9PVt8s(PaintingStyle.INSTANCE.m4499getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle p0) {
        if (Intrinsics.areEqual(p0, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (!(p0 instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        Paint paintObtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) p0;
        if (paintObtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            paintObtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m4585equalsimpl0(paintObtainStrokePaint.mo4091getStrokeCapKaPHkGw(), stroke.getCap())) {
            paintObtainStrokePaint.mo4097setStrokeCapBeK7IIE(stroke.getCap());
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            paintObtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m4595equalsimpl0(paintObtainStrokePaint.mo4092getStrokeJoinLxFBmk8(), stroke.getJoin())) {
            paintObtainStrokePaint.mo4098setStrokeJoinWw9F2mQ(stroke.getJoin());
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
            paintObtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    static /* synthetic */ Paint m4688configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.INSTANCE.m4801getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m4687configurePaintswdJneE(brush, drawStyle, f, colorFilter, i, i2);
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m4687configurePaintswdJneE(Brush p0, DrawStyle p1, float p2, ColorFilter p3, int p4, int p5) {
        Paint paintSelectPaint = selectPaint(p1);
        if (p0 != null) {
            p0.mo4164applyToPq9zytI(mo4798getSizeNHjbRc(), paintSelectPaint, p2);
        } else {
            if (paintSelectPaint.getInternalShader() != null) {
                paintSelectPaint.setShader(null);
            }
            if (!Color.m4219equalsimpl0(paintSelectPaint.mo4089getColor0d7_KjU(), Color.INSTANCE.m4244getBlack0d7_KjU())) {
                paintSelectPaint.mo4095setColor8_81llA(Color.INSTANCE.m4244getBlack0d7_KjU());
            }
            if (paintSelectPaint.getAlpha() != p2) {
                paintSelectPaint.setAlpha(p2);
            }
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getInternalColorFilter(), p3)) {
            paintSelectPaint.setColorFilter(p3);
        }
        if (!BlendMode.m4128equalsimpl0(paintSelectPaint.get_blendMode(), p4)) {
            paintSelectPaint.mo4094setBlendModes9anfk8(p4);
        }
        if (!FilterQuality.m4315equalsimpl0(paintSelectPaint.mo4090getFilterQualityfv9h1I(), p5)) {
            paintSelectPaint.mo4096setFilterQualityvDHp3xo(p5);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    static /* synthetic */ Paint m4686configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        return canvasDrawScope.m4685configurePaint2qPWKa0(j, drawStyle, f, colorFilter, i, (i3 & 32) != 0 ? DrawScope.INSTANCE.m4801getDefaultFilterQualityfv9h1I() : i2);
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m4685configurePaint2qPWKa0(long p0, DrawStyle p1, float p2, ColorFilter p3, int p4, int p5) {
        Paint paintSelectPaint = selectPaint(p1);
        long jM4693modulate5vOe2sY = m4693modulate5vOe2sY(p0, p2);
        if (!Color.m4219equalsimpl0(paintSelectPaint.mo4089getColor0d7_KjU(), jM4693modulate5vOe2sY)) {
            paintSelectPaint.mo4095setColor8_81llA(jM4693modulate5vOe2sY);
        }
        if (paintSelectPaint.getInternalShader() != null) {
            paintSelectPaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getInternalColorFilter(), p3)) {
            paintSelectPaint.setColorFilter(p3);
        }
        if (!BlendMode.m4128equalsimpl0(paintSelectPaint.get_blendMode(), p4)) {
            paintSelectPaint.mo4094setBlendModes9anfk8(p4);
        }
        if (!FilterQuality.m4315equalsimpl0(paintSelectPaint.mo4090getFilterQualityfv9h1I(), p5)) {
            paintSelectPaint.mo4096setFilterQualityvDHp3xo(p5);
        }
        return paintSelectPaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    static /* synthetic */ Paint m4690configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m4689configureStrokePaintQ_0CZUI(j, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & 512) != 0 ? DrawScope.INSTANCE.m4801getDefaultFilterQualityfv9h1I() : i4);
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m4689configureStrokePaintQ_0CZUI(long p0, float p1, float p2, int p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8, int p9) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        long jM4693modulate5vOe2sY = m4693modulate5vOe2sY(p0, p6);
        if (!Color.m4219equalsimpl0(paintObtainStrokePaint.mo4089getColor0d7_KjU(), jM4693modulate5vOe2sY)) {
            paintObtainStrokePaint.mo4095setColor8_81llA(jM4693modulate5vOe2sY);
        }
        if (paintObtainStrokePaint.getInternalShader() != null) {
            paintObtainStrokePaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getInternalColorFilter(), p7)) {
            paintObtainStrokePaint.setColorFilter(p7);
        }
        if (!BlendMode.m4128equalsimpl0(paintObtainStrokePaint.get_blendMode(), p8)) {
            paintObtainStrokePaint.mo4094setBlendModes9anfk8(p8);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != p1) {
            paintObtainStrokePaint.setStrokeWidth(p1);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != p2) {
            paintObtainStrokePaint.setStrokeMiterLimit(p2);
        }
        if (!StrokeCap.m4585equalsimpl0(paintObtainStrokePaint.mo4091getStrokeCapKaPHkGw(), p3)) {
            paintObtainStrokePaint.mo4097setStrokeCapBeK7IIE(p3);
        }
        if (!StrokeJoin.m4595equalsimpl0(paintObtainStrokePaint.mo4092getStrokeJoinLxFBmk8(), p4)) {
            paintObtainStrokePaint.mo4098setStrokeJoinWw9F2mQ(p4);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), p5)) {
            paintObtainStrokePaint.setPathEffect(p5);
        }
        if (!FilterQuality.m4315equalsimpl0(paintObtainStrokePaint.mo4090getFilterQualityfv9h1I(), p9)) {
            paintObtainStrokePaint.mo4096setFilterQualityvDHp3xo(p9);
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    static /* synthetic */ Paint m4692configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f, float f2, int i, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, int i5, Object obj) {
        return canvasDrawScope.m4691configureStrokePaintho4zsrM(brush, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & 512) != 0 ? DrawScope.INSTANCE.m4801getDefaultFilterQualityfv9h1I() : i4);
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m4691configureStrokePaintho4zsrM(Brush p0, float p1, float p2, int p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8, int p9) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        if (p0 != null) {
            p0.mo4164applyToPq9zytI(mo4798getSizeNHjbRc(), paintObtainStrokePaint, p6);
        } else if (paintObtainStrokePaint.getAlpha() != p6) {
            paintObtainStrokePaint.setAlpha(p6);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getInternalColorFilter(), p7)) {
            paintObtainStrokePaint.setColorFilter(p7);
        }
        if (!BlendMode.m4128equalsimpl0(paintObtainStrokePaint.get_blendMode(), p8)) {
            paintObtainStrokePaint.mo4094setBlendModes9anfk8(p8);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != p1) {
            paintObtainStrokePaint.setStrokeWidth(p1);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != p2) {
            paintObtainStrokePaint.setStrokeMiterLimit(p2);
        }
        if (!StrokeCap.m4585equalsimpl0(paintObtainStrokePaint.mo4091getStrokeCapKaPHkGw(), p3)) {
            paintObtainStrokePaint.mo4097setStrokeCapBeK7IIE(p3);
        }
        if (!StrokeJoin.m4595equalsimpl0(paintObtainStrokePaint.mo4092getStrokeJoinLxFBmk8(), p4)) {
            paintObtainStrokePaint.mo4098setStrokeJoinWw9F2mQ(p4);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), p5)) {
            paintObtainStrokePaint.setPathEffect(p5);
        }
        if (!FilterQuality.m4315equalsimpl0(paintObtainStrokePaint.mo4090getFilterQualityfv9h1I(), p9)) {
            paintObtainStrokePaint.mo4096setFilterQualityvDHp3xo(p9);
        }
        return paintObtainStrokePaint;
    }

    /* JADX INFO: renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m4693modulate5vOe2sY(long j, float f) {
        return f == 1.0f ? j : Color.m4217copywmQWz5c$default(j, Color.m4220getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH×\u0001¢\u0006\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010/R\"\u00100\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u00104"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "Landroidx/compose/ui/unit/Density;", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "Landroidx/compose/ui/graphics/Canvas;", "p2", "Landroidx/compose/ui/geometry/Size;", "p3", "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/unit/Density;", "component2", "()Landroidx/compose/ui/unit/LayoutDirection;", "component3", "()Landroidx/compose/ui/graphics/Canvas;", "component4-NH-jbRc", "()J", "component4", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "copy", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "size", "J", "getSize-NH-jbRc", "setSize-uvyYCjk", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, EmptyCanvas emptyCanvas, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? EmptyCanvas.INSTANCE : emptyCanvas, (i & 8) != 0 ? Size.INSTANCE.m4052getZeroNHjbRc() : j, null);
        }

        public final Density getDensity() {
            return this.density;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m4717getSizeNHjbRc() {
            return this.size;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m4718setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j);
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m4714copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                density = drawParams.density;
            }
            if ((i & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            LayoutDirection layoutDirection2 = layoutDirection;
            if ((i & 4) != 0) {
                canvas = drawParams.canvas;
            }
            Canvas canvas2 = canvas;
            if ((i & 8) != 0) {
                j = drawParams.size;
            }
            return drawParams.m4716copyUg5Nnss(density, layoutDirection2, canvas2, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Density getDensity() {
            return this.density;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Canvas getCanvas() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: component4-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m4716copyUg5Nnss(Density p0, LayoutDirection p1, Canvas p2, long p3) {
            return new DrawParams(p0, p1, p2, p3, null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) p0;
            return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && Size.m4039equalsimpl0(this.size, drawParams.size);
        }

        public final int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m4044hashCodeimpl(this.size);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DrawParams(density=");
            sb.append(this.density);
            sb.append(", layoutDirection=");
            sb.append(this.layoutDirection);
            sb.append(", canvas=");
            sb.append(this.canvas);
            sb.append(", size=");
            sb.append((Object) Size.m4047toStringimpl(this.size));
            sb.append(')');
            return sb.toString();
        }
    }
}
