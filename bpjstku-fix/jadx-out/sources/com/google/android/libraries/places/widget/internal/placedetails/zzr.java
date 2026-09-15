package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.ConnectorAggregation;
import com.google.android.libraries.places.api.model.EVConnectorType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzr extends RecyclerView.Adapter {
    private final List zza;
    private final int zzb;

    public zzr(List list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
        this.zzb = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        zzq zzqVar = (zzq) viewHolder;
        Intrinsics.checkNotNullParameter(zzqVar, "");
        ConnectorAggregation connectorAggregation = (ConnectorAggregation) this.zza.get(i);
        Context context = zzqVar.itemView.getContext();
        TextView textViewZza = zzqVar.zza();
        EVConnectorType type = connectorAggregation.getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(context, "");
        switch (type) {
            case EV_CONNECTOR_TYPE_UNSPECIFIED:
            case EV_CONNECTOR_TYPE_OTHER:
                i2 = R.string.unknown_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_J1772:
                i2 = R.string.j1772_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_TYPE_2:
                i2 = R.string.type_2_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CHADEMO:
                i2 = R.string.chademo_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CCS_COMBO_1:
                i2 = R.string.ccs_combo_1_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_CCS_COMBO_2:
                i2 = R.string.ccs_combo_2_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_TESLA:
                i2 = R.string.tesla_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T:
                i2 = R.string.gb_t_ev_connector_type;
                break;
            case EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET:
                i2 = R.string.wall_outlet_ev_connector_type;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "");
        textViewZza.setText(string);
        zzqVar.zzb().setText(context.getString(R.string.ev_charger_max_charge_rate_kw, Integer.valueOf((int) connectorAggregation.getMaxChargeRateKw().doubleValue())));
        if (connectorAggregation.getAvailableCount() == null) {
            zzqVar.zzc().setVisibility(8);
            return;
        }
        CardView cardViewZzc = zzqVar.zzc();
        int i3 = this.zzb;
        Intrinsics.checkNotNullParameter(connectorAggregation, "");
        Intrinsics.checkNotNullParameter(context, "");
        Integer availableCount = connectorAggregation.getAvailableCount();
        boolean z = (availableCount == null || availableCount.intValue() == 0) ? false : true;
        int color = context.getColor(R.color.places_color_neutral_container);
        int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, iArr);
        int color2 = typedArrayObtainStyledAttributes.getColor(z ? R.styleable.PlacesMaterialThemeAttrs_placesColorPositiveContainer : R.styleable.PlacesMaterialThemeAttrs_placesColorNeutralContainer, color);
        typedArrayObtainStyledAttributes.recycle();
        cardViewZzc.setCardBackgroundColor(color2);
        zzqVar.zzc().setVisibility(0);
        TextView textViewZzd = zzqVar.zzd();
        Intrinsics.checkNotNullParameter(connectorAggregation, "");
        Intrinsics.checkNotNullParameter(context, "");
        Integer availableCount2 = connectorAggregation.getAvailableCount();
        boolean z2 = (availableCount2 == null || availableCount2.intValue() == 0) ? false : true;
        int color3 = context.getColor(R.color.places_color_on_neutral_container);
        int[] iArr2 = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.checkNotNullExpressionValue(iArr2, "");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i3, iArr2);
        int color4 = typedArrayObtainStyledAttributes2.getColor(z2 ? R.styleable.PlacesMaterialThemeAttrs_placesColorOnPositiveContainer : R.styleable.PlacesMaterialThemeAttrs_placesColorOnNeutralContainer, color3);
        typedArrayObtainStyledAttributes2.recycle();
        textViewZzd.setTextColor(color4);
        zzqVar.zzd().setText(context.getString(R.string.ev_charger_connectors_available, connectorAggregation.getAvailableCount(), connectorAggregation.getCount()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ev_charging_option_item, viewGroup, false);
        Intrinsics.checkNotNull(viewInflate);
        return new zzq(viewInflate);
    }
}
