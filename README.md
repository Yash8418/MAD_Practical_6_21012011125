# MAD_Practical_6_21012011125

Study: Service, Types of Service, Drawable Icon Add in project, MediaPlayer, Add Raw folder, Add mp3 song in raw folder

AIM: What is Service? Write down types of Service. Create an MP3 player application by using service by following below instructions.

Create MainActivity and design according to shown in below image. 

Create Service Class and implement MediaPlayer Object

**Question:** What is Service? Write down types of Service.

**Answer:**"Service" is a component that performs background tasks or long-running operations without the need for a user interface. Services run independently of the user interface (UI) and are typically used for tasks that should continue running even when the app is in the background or not currently visible to the user. Services are a fundamental part of Android application development, allowing apps to perform various operations without disrupting the user experience.

There are several types of services in mobile application development:

**Foreground Service:**

A foreground service is a type of service that is used for tasks that the user is actively aware of and can interact with. It is displayed as an ongoing notification in the notification bar to keep the user informed about its operation.
Foreground services are often used for tasks like playing music, providing real-time location updates, or performing important background operations that the user should be aware of.

**Background Service:**

A background service is a service that performs tasks in the background without displaying a visible user interface. It is suitable for tasks that don't require user interaction or notification.
Background services are often used for tasks like data synchronization, file downloads, or background processing of data.

**Bound Service:**

A bound service is a service that allows other components (such as activities) to bind to it and interact with it through interprocess communication (IPC). It provides a client-server interface for communication.
Bound services are often used when multiple components within an app need to share data or functionality with a central service.


