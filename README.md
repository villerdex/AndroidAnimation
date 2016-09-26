# AndroidAnimation
using java class to create different animation in android

###Support:
- view
- fragment v4
- Animator.AnimatorListener 


###Syntax:
      - AnimateUtil.rotateY(view, 180f, 2000, null, true);
      - AnimateUtil.rotateX(view, 180f, 2000, null, true);
      - AnimateUtil.fadeIn(view, 2000, null);
      - AnimateUtil.fadeOut(view, 2000, null);
      - AnimateUtil.rotate(view, 180, 1000, null, false);
      - AnimateUtil.zoomIn(view, 1, 1, 1000, null);
      - AnimateUtil.zoomOut(view, 5, 5, 1000, null);
      - AnimateUtil.moveX(view, 400 , 0, 200, null);
      - AnimateUtil.moveY(view, 500 , 0, 200, null);
      - AnimateUtil.moveYBounce(view, 500 , 0, 200, null);
      - AnimateUtil.moveXBounce(view, 1000 , 0, 500, null);

- View v
the view we want to animate

- float fromDegrees
start degree of the view

- float toDegrees
to what degree must view will end

- long durationMillis how long should the animation perform.

- Animator.AnimatorListener listener listen animation

-  boolean reversable whether we want to able the view to reverse.
eg. after the first click event and the same view was click again it will return to its default degree ( with backward animation )

###NOTE: for the best use, remove the shadows of the view
- by adding this code on XML:
- for Cardview v7: app:cardElevation="0dp"
- for View: android:stateListAnimator="@null"

