Nice Spinner
===================
Android中漂亮的Spinner组件,本组件修改自 <a href='https://github.com/arcadefire/nice-spinner/'>Nice Spinner</a>

## 使用帮助
请参考<a href='https://github.com/arcadefire/nice-spinner/README.md'>原作者的README</a>
基于Nice Spinner继续封装,修改内容:
* 1.支持自定义padding
* 2.下拉框内容支持自定义对齐方向
* 3.下拉框内容支持设置分割线
* 4.支持设置圆角边框

**属性参考**

    <declare-styleable name="NiceSpinner">
        <attr name="arrowTint" format="color" />
        <attr name="hideArrow" format="boolean" />
        <attr name="arrowDrawable" format="reference|color"/>
        <attr name="dropDownListPaddingBottom" format="dimension"/>
        <attr name="backgroundSelector" format="integer"/>
        <attr name="textTint" format="color"/>
        <attr name="dividerColor" format="color"/>
        <attr name="dividerHeight" format="dimension"/>
        <attr name="itemGravity" format="enum">
            <enum name="center" value="17"/>
            <enum name="left" value="3"/>
            <enum name="right" value="5"/>
        </attr>
        <attr name="paddingLeft" format="dimension"/>
        <attr name="paddingRight" format="dimension"/>
        <attr name="paddingTop" format="dimension"/>
        <attr name="paddingBottom" format="dimension"/>
        <attr name="padding" format="dimension"/>
        <attr name="borderColor" format="color"/>
        <attr name="borderWidth" format="dimension"/>
    </declare-styleable>

**布局参考**

    <com.iuling.nicespinner.NiceSpinner
        android:id="@+id/spinner"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:dividerColor="@color/lightGray"
        app:dividerHeight="1dp"
        app:itemGravity="left"
        app:paddingBottom="8dp"
        app:paddingTop="8dp"
        app:paddingLeft="12dp"
        app:paddingRight="12dp"
        />

## 依赖下载
**Maven**

    <dependency>
      <groupId>com.iuling.widget</groupId>
      <artifactId>nice-spinner</artifactId>
      <version>1.3.4</version>
      <type>pom</type>
    </dependency>

**Gradle**

    repositories {
        mavenCentral()
    }

    dependencies {
        compile 'com.iuling.widget:nice-spinner:1.3'
    }
