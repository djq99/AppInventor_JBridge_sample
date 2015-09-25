package com.example.Hellopurr;
// you need the following imports in all Java Bridge apps
import com.google.appinventor.components.runtime.*;

// import any components you are going to use in your app. In this case, just Button


// you can use the following header for all apps
public class Screen1 extends Form implements HandlesEventDispatching
{
    // declare all your components as instance variables
    private Button Button1;
    private Label Label1;
    private Sound Sound1;
    private AccelerometerSensor AccelerometerSensor1;

    // $define is where you'll create components, initialize properties and make any calls that
    // you'd put in Screen.Initialize of an App Inventor app
    protected void $define()
    {
/*
        this.AboutScreen("");
        //left
        this.AlignHorizontal(DIRECTION_EAST);
        //top
        this.AlignVertical(DIRECTION_NORTH);
        this.AppName("HelloPurr");
        this.BackgroundColor(COLOR_WHITE);
        this.BackgroundImage("");
        this.CloseScreenAnimation("Default");
        this.Icon("kitty.png");
        this.OpenScreenAnimation("Default");
        this.ScreenOrientation("Unspecified");
        this.Scrollable(true);
        //no status bar
        */
        Label1 = new Label(this);
        Label1.BackgroundColor(COLOR_BLUE);
        Label1.FontBold(false);
        Label1.FontItalic(false);
        Label1.FontSize(14);
        Label1.FontTypeface(TYPEFACE_DEFAULT);
        Label1.HasMargins(false);
        Label1.Height(LENGTH_PREFERRED);
        Label1.Width(LENGTH_PREFERRED);
        Label1.Text("Pet The Kitty");
        Label1.TextAlignment(ALIGNMENT_NORMAL);
        Label1.TextColor(COLOR_YELLOW);
        Label1.Visible(true);



        // create the button component
        Button1 = new Button(this);  // the parameter defines the parent for the component,
        // in this case, "this" the screen.
        // if you had an arrangement, you'd refer to it instead.
        Button1.Enabled(true);
        Button1.FontBold(false);
        Button1.FontItalic(false);
        Button1.FontSize(14);
        Button1.FontTypeface(TYPEFACE_DEFAULT);
        Button1.Height(LENGTH_PREFERRED);
        Button1.Width(LENGTH_PREFERRED);
        Button1.Image("kitty.png");
        Button1.Shape(BUTTON_SHAPE_DEFAULT);
        Button1.ShowFeedback(true);
        Button1.Text("");
        Button1.TextAlignment(ALIGNMENT_CENTER);
        Button1.TextColor(COLOR_DEFAULT);
        Button1.Visible(true);

        Sound1 = new Sound(this);
        Sound1.MinimumInterval(500);
        Sound1.Source("");

        AccelerometerSensor1 = new AccelerometerSensor(this);
        AccelerometerSensor1.Enabled(true);
        AccelerometerSensor1.MinimumInterval(400);
        AccelerometerSensor1.Sensitivity(ACCELEROMETER_SENSITIVITY_MODERATE);

        // register all events that you want to respond to. The second parameter is
        // just a name, the third is the event you care about and its component-independent
        // so you, e.g., you need just one "Click" event even if many buttons
        EventDispatcher.registerEventForDelegation( this, "Button1Click", "Click" );
        EventDispatcher.registerEventForDelegation( this, "AccelerometerSensor1Shaking", "Shaking");
    }
    // dispatchEvent handles all events. You'll use an if-else to identify the component and
    // event and you can either call a method or just respond to the event directly
    // params provides the event parameters (not used here)
    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params )
    {
        if( component.equals(Button1) && eventName.equals("Click") )
        {
            Button1Click();
            return true;
        }
        else if(component.equals(AccelerometerSensor1) && eventName.equals("Shaking"))
        {
            AccelerometerSensor1Shaking();
            return true;
        }
        // here is where you'd check for other events of your app...
        return false;
    }
    // this is the event handler that dispatchEvent above calls. We just set the button background
    public void Button1Click()
    {
        Sound1.Play();
        Sound1.Vibrate(500);
    }
    public void AccelerometerSensor1Shaking()
    {
        Sound1.Play();
    }


}