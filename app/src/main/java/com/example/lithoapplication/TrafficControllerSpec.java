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
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaWrap;

import static com.facebook.yoga.YogaEdge.ALL;

@LayoutSpec
public class TrafficControllerSpec {


    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c, @Prop(optional = true, resType =  ResType.COLOR) int color ){
        return Column.create(c)
                .paddingDip(ALL, 16)
                .widthDip(112)
                .heightDip(320)
                .backgroundColor(Color.BLACK)
                .child(
                        TrafficLight.create(c).resId(R.drawable.circle_red_background)
                       )
                .child(
                        TrafficLight.create(c).resId(R.drawable.circle_yellow_background)
                )
                .child(
                        TrafficLight.create(c).resId(R.drawable.circle_green_background)
                )
                .build();
    }
}
