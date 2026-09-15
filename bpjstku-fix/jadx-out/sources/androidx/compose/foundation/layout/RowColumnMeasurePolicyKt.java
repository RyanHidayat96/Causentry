package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "", "p0", "p1", "p2", "p3", "p4", "Landroidx/compose/ui/layout/MeasureScope;", "p5", "", "Landroidx/compose/ui/layout/Measurable;", "p6", "", "Landroidx/compose/ui/layout/Placeable;", "p7", "p8", "p9", "", "p10", "p11", "Landroidx/compose/ui/layout/MeasureResult;", "measure", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RowColumnMeasurePolicyKt {
    public static final MeasureResult measure(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i4, int i5, MeasureScope measureScope, List<? extends Measurable> list, Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        int[] iArr2;
        String str;
        float f;
        long j;
        String str2;
        String str3;
        int i9;
        String str4;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        int i10;
        int i11;
        int iCoerceIn;
        int i12;
        float f2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        long j2;
        long j3;
        long j4;
        String str11;
        int i13;
        FlowLayoutData flowLayoutData;
        float f3;
        long j5;
        long j6;
        String str12;
        long j7;
        String str13;
        String str14;
        int i14;
        String str15;
        String str16;
        String str17;
        int iMax;
        int iMax2;
        int[] iArr3;
        FlowLayoutData flowLayoutData2;
        List<? extends Measurable> list2 = list;
        int i15 = i7;
        int i16 = i15 - i6;
        int[] iArr4 = new int[i16];
        int i17 = i6;
        long j8 = i5;
        float f4 = 0.0f;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z = false;
        int i21 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int[] iArr5 = iArr4;
            Measurable measurable = list2.get(i17);
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            z = z || RowColumnImplKt.isRelative(rowColumnParentData);
            if (weight > 0.0f) {
                i19++;
                i17 = i17;
                j8 = j8;
                i16 = i16;
                f4 += weight;
                iArr3 = iArr5;
            } else {
                Integer numValueOf = (i4 == Integer.MAX_VALUE || rowColumnParentData == null || (flowLayoutData2 = rowColumnParentData.getFlowLayoutData()) == null) ? null : Integer.valueOf(Math.round(flowLayoutData2.getFillCrossAxisFraction() * i4));
                int i22 = i3 - i20;
                Placeable placeableMo5637measureBRTryo0 = placeableArr[i17];
                if (placeableMo5637measureBRTryo0 == null) {
                    placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(RowColumnMeasurePolicy.m1027createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy, 0, numValueOf != null ? numValueOf.intValue() : 0, i3 != Integer.MAX_VALUE ? RangesKt.coerceAtLeast(i22, 0) : Integer.MAX_VALUE, numValueOf != null ? numValueOf.intValue() : i4, false, 16, null));
                }
                int iMainAxisSize = rowColumnMeasurePolicy.mainAxisSize(placeableMo5637measureBRTryo0);
                int iCrossAxisSize = rowColumnMeasurePolicy.crossAxisSize(placeableMo5637measureBRTryo0);
                iArr3 = iArr5;
                iArr3[i17 - i6] = iMainAxisSize;
                int iMin = Math.min(i5, RangesKt.coerceAtLeast(i22 - iMainAxisSize, 0));
                int i23 = iMainAxisSize + iMin + i20;
                int iMax3 = Math.max(i21, iCrossAxisSize);
                placeableArr[i17] = placeableMo5637measureBRTryo0;
                i21 = iMax3;
                i18 = iMin;
                i20 = i23;
                i19 = i19;
            }
            i17++;
            iArr4 = iArr3;
            f4 = f4;
            i16 = i16;
            j8 = j8;
        }
        int i24 = i19;
        int i25 = i20;
        long j9 = j8;
        int i26 = i16;
        float f5 = f4;
        int[] iArr6 = iArr4;
        if (i24 == 0) {
            rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
            i10 = i25 - i18;
            i11 = 0;
            iCoerceIn = 0;
            iArr2 = iArr6;
            i12 = i21;
        } else {
            int i27 = i3 != Integer.MAX_VALUE ? i3 : i;
            long j10 = ((long) (i24 - 1)) * j9;
            long j11 = j10;
            long jCoerceAtLeast = RangesKt.coerceAtLeast(((long) (i27 - i25)) - j10, 0L);
            float f6 = jCoerceAtLeast / f5;
            int i28 = i6;
            long jRound = jCoerceAtLeast;
            iArr2 = iArr6;
            while (true) {
                str = "arrangementSpacingPx ";
                f = f5;
                j = jCoerceAtLeast;
                str2 = "targetSpace ";
                str3 = "fixedSpace ";
                i9 = i25;
                str4 = "remainingToTarget ";
                if (i28 >= i15) {
                    break;
                }
                float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(list2.get(i28)));
                float f7 = f6 * weight2;
                try {
                    jRound -= (long) Math.round(f7);
                    i28++;
                    list2 = list;
                    i15 = i7;
                    f5 = f;
                    jCoerceAtLeast = j;
                    i25 = i9;
                } catch (IllegalArgumentException e2) {
                    StringBuilder sb = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ");
                    sb.append(i3);
                    sb.append("mainAxisMin ");
                    sb.append(i);
                    sb.append("targetSpace ");
                    sb.append(i27);
                    sb.append("arrangementSpacingPx ");
                    sb.append(j9);
                    sb.append("weightChildrenCount ");
                    sb.append(i24);
                    sb.append("fixedSpace ");
                    sb.append(i9);
                    sb.append("arrangementSpacingTotal ");
                    sb.append(j11);
                    sb.append("remainingToTarget ");
                    sb.append(j);
                    sb.append("totalWeight ");
                    sb.append(f);
                    sb.append("weightUnitSpace ");
                    sb.append(f6);
                    sb.append("itemWeight ");
                    sb.append(weight2);
                    sb.append("weightedSize ");
                    sb.append(f7);
                    throw new IllegalArgumentException(sb.toString()).initCause(e2);
                }
            }
            String str18 = "totalWeight ";
            float f8 = f;
            String str19 = "weightedSize ";
            long j12 = j;
            int i29 = i9;
            String str20 = "arrangementSpacingTotal ";
            String str21 = "weightUnitSpace ";
            long j13 = j9;
            int iMax4 = i21;
            int i30 = 0;
            int i31 = i6;
            while (i31 < i7) {
                if (placeableArr[i31] == null) {
                    Measurable measurable2 = list.get(i31);
                    RowColumnParentData rowColumnParentData2 = RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight3 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    String str22 = str2;
                    int i32 = i29;
                    str11 = str;
                    Integer numValueOf2 = (i4 == Integer.MAX_VALUE || rowColumnParentData2 == null || (flowLayoutData = rowColumnParentData2.getFlowLayoutData()) == null) ? null : Integer.valueOf(Math.round(i4 * flowLayoutData.getFillCrossAxisFraction()));
                    if (weight3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt.getSign(jRound);
                    int i33 = i24;
                    String str23 = str4;
                    jRound -= (long) sign;
                    float f9 = f6 * weight3;
                    int iMax5 = Math.max(0, Math.round(f9) + sign);
                    try {
                        f3 = f6;
                        j5 = j11;
                        j6 = j12;
                        str13 = str22;
                        str14 = str3;
                        i14 = i33;
                        str16 = str19;
                        str12 = str21;
                        i13 = i32;
                        str15 = str23;
                        j7 = j13;
                        str17 = str20;
                        try {
                            Placeable placeableMo5637measureBRTryo1 = measurable2.mo5637measureBRTryo0(rowColumnMeasurePolicy.mo917createConstraintsxF2OJ5Q((!RowColumnImplKt.getFill(rowColumnParentData2) || iMax5 == Integer.MAX_VALUE) ? 0 : iMax5, numValueOf2 != null ? numValueOf2.intValue() : 0, iMax5, numValueOf2 != null ? numValueOf2.intValue() : i4, true));
                            int iMainAxisSize2 = rowColumnMeasurePolicy.mainAxisSize(placeableMo5637measureBRTryo1);
                            int iCrossAxisSize2 = rowColumnMeasurePolicy.crossAxisSize(placeableMo5637measureBRTryo1);
                            iArr2[i31 - i6] = iMainAxisSize2;
                            iMax4 = Math.max(iMax4, iCrossAxisSize2);
                            placeableArr[i31] = placeableMo5637measureBRTryo1;
                            i30 += iMainAxisSize2;
                            str6 = str16;
                            str7 = str17;
                            f2 = f3;
                            j3 = j5;
                            j2 = j6;
                            str8 = str13;
                            str5 = str14;
                            i24 = i14;
                            str10 = str12;
                            str9 = str15;
                            j4 = j7;
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            StringBuilder sb2 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                            sb2.append(i3);
                            sb2.append("mainAxisMin ");
                            sb2.append(i);
                            sb2.append(str13);
                            sb2.append(i27);
                            sb2.append(str11);
                            sb2.append(j7);
                            sb2.append("weightChildrenCount ");
                            sb2.append(i14);
                            sb2.append(str14);
                            sb2.append(i13);
                            sb2.append(str17);
                            sb2.append(j5);
                            sb2.append(str15);
                            sb2.append(j6);
                            sb2.append(str18);
                            sb2.append(f8);
                            sb2.append(str12);
                            sb2.append(f3);
                            sb2.append("weight ");
                            sb2.append(weight3);
                            sb2.append(str16);
                            sb2.append(f9);
                            sb2.append("crossAxisDesiredSize ");
                            sb2.append(numValueOf2);
                            sb2.append("remainderUnit ");
                            sb2.append(sign);
                            sb2.append("childMainAxisSize ");
                            sb2.append(iMax5);
                            throw new IllegalArgumentException(sb2.toString()).initCause(e);
                        }
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        f3 = f6;
                        j5 = j11;
                        j6 = j12;
                        str12 = str21;
                        i13 = i32;
                        j7 = j13;
                        str13 = str22;
                        str14 = str3;
                        i14 = i33;
                        str15 = str23;
                        str16 = str19;
                        str17 = str20;
                    }
                } else {
                    f2 = f6;
                    str5 = str3;
                    str6 = str19;
                    str7 = str20;
                    str8 = str2;
                    long j14 = j13;
                    str9 = str4;
                    str10 = str21;
                    j2 = j12;
                    j3 = j11;
                    j4 = j14;
                    int i34 = i29;
                    str11 = str;
                    i13 = i34;
                }
                i31++;
                f8 = f8;
                str2 = str8;
                str3 = str5;
                f6 = f2;
                str18 = str18;
                str4 = str9;
                String str24 = str11;
                i29 = i13;
                str = str24;
                long j15 = j2;
                str20 = str7;
                str19 = str6;
                str21 = str10;
                j13 = j4;
                j11 = j3;
                j12 = j15;
            }
            rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
            i10 = i29;
            i11 = 0;
            iCoerceIn = RangesKt.coerceIn((int) (((long) i30) + j11), 0, i3 - i10);
            i12 = iMax4;
        }
        if (z) {
            iMax = i11;
            iMax2 = iMax;
            for (int i35 = i6; i35 < i7; i35++) {
                Placeable placeable = placeableArr[i35];
                Intrinsics.checkNotNull(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable));
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    int iCrossAxisSize3 = rowColumnMeasurePolicy2.crossAxisSize(placeable);
                    iMax2 = Math.max(iMax2, iIntValue != Integer.MIN_VALUE ? numCalculateAlignmentLinePosition$foundation_layout_release.intValue() : i11);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iCrossAxisSize3;
                    }
                    iMax = Math.max(iMax, iCrossAxisSize3 - iIntValue);
                }
            }
        } else {
            iMax = i11;
            iMax2 = iMax;
        }
        int iMax6 = Math.max(RangesKt.coerceAtLeast(i10 + iCoerceIn, i11), i);
        int iMax7 = Math.max(i12, Math.max(i2, iMax + iMax2));
        int[] iArr7 = new int[i26];
        for (int i36 = i11; i36 < i26; i36++) {
            iArr7[i36] = i11;
        }
        rowColumnMeasurePolicy2.populateMainAxisPositions(iMax6, iArr2, iArr7, measureScope);
        return rowColumnMeasurePolicy.placeHelper(placeableArr, measureScope, iMax2, iArr7, iMax6, iMax7, iArr, i8, i6, i7);
    }
}
