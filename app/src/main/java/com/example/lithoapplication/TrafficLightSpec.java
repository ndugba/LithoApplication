package com.example.lithoapplication;

import android.graphics.Color;
import android.text.Layout;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.annotations.ResType;
import com.facebook.litho.widget.Text;
import com.facebook.litho.widget.VerticalGravity;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaWrap;


@LayoutSpec
public class TrafficLightSpec {

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c, @Prop int resId){
        return Text.create(c)
                                .text("20s")
                                .widthDip(80)
                                .heightDip(80)
                                .textAlignment(Layout.Alignment.ALIGN_CENTER)
                                .verticalGravity(VerticalGravity.CENTER)
                                .backgroundRes(resId)
                                .marginDip(YogaEdge.TOP, 15)
                                .textSizeSp(20)
                .build();
    }
}
