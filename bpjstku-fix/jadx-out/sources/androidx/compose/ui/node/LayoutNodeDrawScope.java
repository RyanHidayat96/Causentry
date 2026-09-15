package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0011\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010!\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u001f\u0010 Jb\u00100\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020#2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b.\u0010/Jb\u00100\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u000e\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020#2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b2\u00103JJ\u00106\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b4\u00105JJ\u00106\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u000e\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b7\u00108JB\u0010<\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002092\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020(2\b\u0010\u001b\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b:\u0010;JZ\u0010<\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002092\u0006\u0010\u000e\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u0097\u0001¢\u0006\u0004\b>\u0010?Jb\u0010<\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002092\u0006\u0010\u000e\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020@H\u0096\u0001¢\u0006\u0004\bA\u0010BJ\\\u0010G\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020C2\b\u0010&\u001a\u0004\u0018\u00010D2\u0006\u0010'\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bE\u0010FJ\\\u0010G\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020C2\b\u0010&\u001a\u0004\u0018\u00010D2\u0006\u0010'\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bH\u0010IJJ\u0010L\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bJ\u0010KJJ\u0010L\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bM\u0010NJB\u0010R\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020O2\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020(2\b\u0010\u001b\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bP\u0010QJB\u0010R\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020O2\u0006\u0010\u000e\u001a\u0002012\u0006\u0010\u0018\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020(2\b\u0010\u001b\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bS\u0010TJb\u0010Y\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020%0U2\u0006\u0010\u000e\u001a\u00020V2\u0006\u0010\u0018\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020C2\b\u0010&\u001a\u0004\u0018\u00010D2\u0006\u0010'\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bW\u0010XJb\u0010Y\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020%0U2\u0006\u0010\u000e\u001a\u00020V2\u0006\u0010\u0018\u001a\u0002012\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020C2\b\u0010&\u001a\u0004\u0018\u00010D2\u0006\u0010'\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bZ\u0010[JJ\u0010]\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b\\\u0010KJJ\u0010]\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020(2\b\u0010&\u001a\u0004\u0018\u00010*2\u0006\u0010'\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b^\u0010NJR\u0010b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020_2\u0006\u0010\u001b\u001a\u00020#2\u0006\u0010&\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b`\u0010aJR\u0010b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u0002012\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020_2\u0006\u0010\u001b\u001a\u00020(2\u0006\u0010&\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010*2\u0006\u0010)\u001a\u00020,H\u0096\u0001¢\u0006\u0004\bc\u0010dJ\u0014\u0010i\u001a\u00020f*\u00020eH\u0097\u0001¢\u0006\u0004\bg\u0010hJ\u0014\u0010i\u001a\u00020f*\u00020jH\u0097\u0001¢\u0006\u0004\bk\u0010lJ\u0014\u0010o\u001a\u00020e*\u00020fH\u0097\u0001¢\u0006\u0004\bm\u0010nJ\u0014\u0010o\u001a\u00020e*\u00020#H\u0097\u0001¢\u0006\u0004\bm\u0010pJ\u0014\u0010o\u001a\u00020e*\u00020jH\u0097\u0001¢\u0006\u0004\bq\u0010rJ\u0014\u0010v\u001a\u00020s*\u00020\u0016H\u0097\u0001¢\u0006\u0004\bt\u0010uJ\u0014\u0010x\u001a\u00020#*\u00020eH\u0097\u0001¢\u0006\u0004\bw\u0010pJ\u0014\u0010x\u001a\u00020#*\u00020jH\u0097\u0001¢\u0006\u0004\by\u0010rJ\u0014\u0010|\u001a\u00020{*\u00020zH\u0097\u0001¢\u0006\u0004\b|\u0010}J\u0014\u0010\u007f\u001a\u00020\u0016*\u00020sH\u0097\u0001¢\u0006\u0004\b~\u0010uJ\u0017\u0010\u0082\u0001\u001a\u00020j*\u00020fH\u0097\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0017\u0010\u0082\u0001\u001a\u00020j*\u00020#H\u0097\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0083\u0001J\u0017\u0010\u0082\u0001\u001a\u00020j*\u00020eH\u0097\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001R\u001f\u0010\u0085\u0001\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008d\u0001\u001a\u00020%8WX\u0096\u0005¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0090\u0001\u001a\u00020#8\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020#8\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u008f\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00168WX\u0096\u0005¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u008c\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "p0", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "drawContent", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "p1", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "record", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "performDraw", "(Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/node/NodeCoordinator;", "p2", "Landroidx/compose/ui/Modifier$Node;", "p3", "p4", "draw-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "drawDirect-eZhPAX0$ui_release", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "drawDirect", "Landroidx/compose/ui/graphics/Brush;", "", "", "Landroidx/compose/ui/geometry/Offset;", "p5", "p6", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "p7", "Landroidx/compose/ui/graphics/ColorFilter;", "p8", "Landroidx/compose/ui/graphics/BlendMode;", "p9", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/graphics/StrokeCap;", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "drawNode", "Landroidx/compose/ui/node/DrawModifierNode;", "getCenter-F1C5BW0", "()J", "center", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public final void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode != null) {
            DrawModifierNode drawModifierNode2 = drawModifierNode;
            Modifier.Node nodeNextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode2);
            if (nodeNextDrawNode == 0) {
                NodeCoordinator nodeCoordinatorM5782requireCoordinator64DMado = DelegatableNodeKt.m5782requireCoordinator64DMado(drawModifierNode2, NodeKind.m5928constructorimpl(4));
                if (nodeCoordinatorM5782requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                    nodeCoordinatorM5782requireCoordinator64DMado = nodeCoordinatorM5782requireCoordinator64DMado.getWrapped();
                    Intrinsics.checkNotNull(nodeCoordinatorM5782requireCoordinator64DMado);
                }
                nodeCoordinatorM5782requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
                return;
            }
            int iM5928constructorimpl = NodeKind.m5928constructorimpl(4);
            MutableVector mutableVector = null;
            while (nodeNextDrawNode != 0) {
                if (nodeNextDrawNode instanceof DrawModifierNode) {
                    performDraw((DrawModifierNode) nodeNextDrawNode, canvas, getDrawContext().getGraphicsLayer());
                } else if ((nodeNextDrawNode.getKindSet() & iM5928constructorimpl) != 0 && (nodeNextDrawNode instanceof DelegatingNode)) {
                    Modifier.Node delegate = ((DelegatingNode) nodeNextDrawNode).getDelegate();
                    int i = 0;
                    nodeNextDrawNode = nodeNextDrawNode;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & iM5928constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                nodeNextDrawNode = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (nodeNextDrawNode != 0) {
                                    if (mutableVector != null) {
                                        mutableVector.add(nodeNextDrawNode);
                                    }
                                    nodeNextDrawNode = 0;
                                }
                                if (mutableVector != null) {
                                    mutableVector.add(delegate);
                                }
                            }
                        }
                        delegate = delegate.getChild();
                        nodeNextDrawNode = nodeNextDrawNode;
                    }
                    if (i != 1) {
                    }
                }
                nodeNextDrawNode = DelegatableNodeKt.pop(mutableVector);
            }
            return;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: record-JVtK1S4 */
    public final void mo4799recordJVtK1S4(GraphicsLayer graphicsLayer, long j, final Function1<? super DrawScope, Unit> function1) {
        final DrawModifierNode drawModifierNode = this.drawNode;
        graphicsLayer.m4892recordmLhObY(this, getLayoutDirection(), j, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) throws Throwable {
                ?? drawContext = this.this$0.drawNode;
                this.this$0.drawNode = drawModifierNode;
                try {
                    LayoutNodeDrawScope layoutNodeDrawScope = this.this$0;
                    Density density = drawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    Canvas canvas = drawScope.getDrawContext().getCanvas();
                    long jMo4719getSizeNHjbRc = drawScope.getDrawContext().mo4719getSizeNHjbRc();
                    GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    Function1<DrawScope, Unit> function2 = function1;
                    Density density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    LayoutDirection layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    Canvas canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
                    long jMo4719getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo4719getSizeNHjbRc();
                    GraphicsLayer graphicsLayer3 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
                    try {
                        drawContext = layoutNodeDrawScope.getDrawContext();
                        drawContext.setDensity(density);
                        drawContext.setLayoutDirection(layoutDirection);
                        drawContext.setCanvas(canvas);
                        drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                        drawContext.setGraphicsLayer(graphicsLayer2);
                        canvas.save();
                        try {
                            function2.invoke(layoutNodeDrawScope);
                            canvas.restore();
                            DrawContext drawContext2 = layoutNodeDrawScope.getDrawContext();
                            drawContext2.setDensity(density2);
                            drawContext2.setLayoutDirection(layoutDirection2);
                            drawContext2.setCanvas(canvas2);
                            drawContext2.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc2);
                            drawContext2.setGraphicsLayer(graphicsLayer3);
                            this.this$0.drawNode = drawContext;
                        } catch (Throwable th) {
                            canvas.restore();
                            DrawContext drawContext3 = layoutNodeDrawScope.getDrawContext();
                            drawContext3.setDensity(density2);
                            drawContext3.setLayoutDirection(layoutDirection2);
                            drawContext3.setCanvas(canvas2);
                            drawContext3.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc2);
                            drawContext3.setGraphicsLayer(graphicsLayer3);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        drawContext = drawContext;
                        this.this$0.drawNode = drawContext;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorM5782requireCoordinator64DMado = DelegatableNodeKt.m5782requireCoordinator64DMado(drawModifierNode, NodeKind.m5928constructorimpl(4));
        nodeCoordinatorM5782requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m5851drawDirecteZhPAX0$ui_release(canvas, IntSizeKt.m7118toSizeozmzZPI(nodeCoordinatorM5782requireCoordinator64DMado.mo5645getSizeYbymL2g()), nodeCoordinatorM5782requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    /* JADX INFO: renamed from: drawDirect-eZhPAX0$ui_release, reason: not valid java name */
    public final void m5851drawDirecteZhPAX0$ui_release(Canvas p0, long p1, NodeCoordinator p2, DrawModifierNode p3, GraphicsLayer p4) {
        DrawModifierNode drawModifierNode = this.drawNode;
        this.drawNode = p3;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = p2.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas = canvasDrawScope.getDrawContext().getCanvas();
        long jMo4719getSizeNHjbRc = canvasDrawScope.getDrawContext().mo4719getSizeNHjbRc();
        GraphicsLayer graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(p2);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(p0);
        drawContext.mo4720setSizeuvyYCjk(p1);
        drawContext.setGraphicsLayer(p4);
        p0.save();
        try {
            p3.draw(this);
            p0.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas);
            drawContext2.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            this.drawNode = drawModifierNode;
        } catch (Throwable th) {
            p0.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas);
            drawContext3.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
    }

    /* JADX INFO: renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m5850draweZhPAX0$ui_release(Canvas p0, long p1, NodeCoordinator p2, Modifier.Node p3, GraphicsLayer p4) {
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(4);
        Modifier.Node nodePop = p3;
        MutableVector mutableVector = null;
        while (nodePop != null) {
            if (nodePop instanceof DrawModifierNode) {
                m5851drawDirecteZhPAX0$ui_release(p0, p1, p2, (DrawModifierNode) nodePop, p4);
            } else if ((nodePop.getKindSet() & iM5928constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                int i = 0;
                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iM5928constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            nodePop = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (nodePop != null) {
                                if (mutableVector != null) {
                                    mutableVector.add(nodePop);
                                }
                                nodePop = null;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                }
                if (i != 1) {
                }
            }
            nodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I */
    public final void mo4695drawArcillE91I(Brush p0, float p1, float p2, boolean p3, long p4, long p5, float p6, DrawStyle p7, ColorFilter p8, int p9) {
        this.canvasDrawScope.mo4695drawArcillE91I(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    public final void mo4696drawArcyD3GUKo(long p0, float p1, float p2, boolean p3, long p4, long p5, float p6, DrawStyle p7, ColorFilter p8, int p9) {
        this.canvasDrawScope.mo4696drawArcyD3GUKo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    public final void mo4697drawCircleV9BoPsw(Brush p0, float p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.canvasDrawScope.mo4697drawCircleV9BoPsw(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    public final void mo4698drawCircleVaOC9Bg(long p0, float p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.canvasDrawScope.mo4698drawCircleVaOC9Bg(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    public final /* synthetic */ void mo4699drawImage9jGpkUE(ImageBitmap p0, long p1, long p2, long p3, long p4, float p5, DrawStyle p6, ColorFilter p7, int p8) {
        this.canvasDrawScope.mo4699drawImage9jGpkUE(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    public final void mo4700drawImageAZ2fEMs(ImageBitmap p0, long p1, long p2, long p3, long p4, float p5, DrawStyle p6, ColorFilter p7, int p8, int p9) {
        this.canvasDrawScope.mo4700drawImageAZ2fEMs(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    public final void mo4701drawImagegbVJVH8(ImageBitmap p0, long p1, float p2, DrawStyle p3, ColorFilter p4, int p5) {
        this.canvasDrawScope.mo4701drawImagegbVJVH8(p0, p1, p2, p3, p4, p5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    public final void mo4702drawLine1RTmtNc(Brush p0, long p1, long p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.canvasDrawScope.mo4702drawLine1RTmtNc(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    public final void mo4703drawLineNGM6Ib0(long p0, long p1, long p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.canvasDrawScope.mo4703drawLineNGM6Ib0(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w */
    public final void mo4704drawOvalAsUm42w(Brush p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.canvasDrawScope.mo4704drawOvalAsUm42w(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    public final void mo4705drawOvalnJ9OG0(long p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.canvasDrawScope.mo4705drawOvalnJ9OG0(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    public final void mo4706drawPathGBMwjPU(Path p0, Brush p1, float p2, DrawStyle p3, ColorFilter p4, int p5) {
        this.canvasDrawScope.mo4706drawPathGBMwjPU(p0, p1, p2, p3, p4, p5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI */
    public final void mo4707drawPathLG529CI(Path p0, long p1, float p2, DrawStyle p3, ColorFilter p4, int p5) {
        this.canvasDrawScope.mo4707drawPathLG529CI(p0, p1, p2, p3, p4, p5);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    public final void mo4708drawPointsF8ZwMP8(List<Offset> p0, int p1, long p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.canvasDrawScope.mo4708drawPointsF8ZwMP8(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    public final void mo4709drawPointsGsft0Ws(List<Offset> p0, int p1, Brush p2, float p3, int p4, PathEffect p5, float p6, ColorFilter p7, int p8) {
        this.canvasDrawScope.mo4709drawPointsGsft0Ws(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w */
    public final void mo4710drawRectAsUm42w(Brush p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.canvasDrawScope.mo4710drawRectAsUm42w(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    public final void mo4711drawRectnJ9OG0(long p0, long p1, long p2, float p3, DrawStyle p4, ColorFilter p5, int p6) {
        this.canvasDrawScope.mo4711drawRectnJ9OG0(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    public final void mo4712drawRoundRectZuiqVtQ(Brush p0, long p1, long p2, long p3, float p4, DrawStyle p5, ColorFilter p6, int p7) {
        this.canvasDrawScope.mo4712drawRoundRectZuiqVtQ(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    public final void mo4713drawRoundRectuAw5IA(long p0, long p1, long p2, long p3, DrawStyle p4, float p5, ColorFilter p6, int p7) {
        this.canvasDrawScope.mo4713drawRoundRectuAw5IA(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    public final long mo4797getCenterF1C5BW0() {
        return this.canvasDrawScope.mo4797getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: getSize-NH-jbRc */
    public final long mo4798getSizeNHjbRc() {
        return this.canvasDrawScope.mo4798getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo687roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo687roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo688roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo688roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo689toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo689toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo690toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo690toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo691toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo691toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo692toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.mo692toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo693toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo693toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo694toPx0680j_4(float f) {
        return this.canvasDrawScope.mo694toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final Rect toRect(DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo695toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.mo695toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo696toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo696toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo697toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo697toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo698toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.mo698toSpkPz2Gy4(i);
    }
}
