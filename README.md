# SquareViewSLib
A simple lib for maintain square for views


#Usage:
#Project Level:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	
#App Level:

	dependencies {
	        implementation 'com.github.sagarmakhija1994:SquareViewSLib:Tag'
	}
	
	
can be use direct in parent view

note**: it not working direct under ConstraintLayout

		<com.simpli5infotech.squareviewslib.SquareLinearWidth
			android:layout_width="match_parent"
			android:layout_height="match_parent"
			android:background="#000000">            
		</com.simpli5infotech.squareviewslib.SquareLinearWidth>
		
working with LinearLayout (weightSum/layout_weight)
		
	<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:weightSum="10">
        <com.simpli5infotech.squareviewslib.SquareLinearWidth
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#000000">

        </com.simpli5infotech.squareviewslib.SquareLinearWidth>
        <com.simpli5infotech.squareviewslib.SquareLinearWidth
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#FF0000">

        </com.simpli5infotech.squareviewslib.SquareLinearWidth>
        <com.simpli5infotech.squareviewslib.SquareLinearWidth
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#00FF00">

        </com.simpli5infotech.squareviewslib.SquareLinearWidth>
        <com.simpli5infotech.squareviewslib.SquareLinearWidth
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#0000FF">

        </com.simpli5infotech.squareviewslib.SquareLinearWidth>
    </LinearLayout>


#Screenshots:

![alt text](https://github.com/sagarmakhija1994/SquareViewSLib/blob/master/view1.jpg)
![alt text](https://github.com/sagarmakhija1994/SquareViewSLib/blob/master/view2.jpg)
![alt text](https://github.com/sagarmakhija1994/SquareViewSLib/blob/master/view3.jpg)
![alt text](https://github.com/sagarmakhija1994/SquareViewSLib/blob/master/view4.jpg)
