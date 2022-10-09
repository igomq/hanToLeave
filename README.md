# hanToLeave
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Build Status](http://ci.gomq.live/app/rest/builds/buildType:(project:HanToLeave)/statusIcon)](https://ci.gomq.live/project.html?projectId=Hantoleave&tab=projectOverview)
![Java](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=white)
-- -- --
### Minecraft Plugin for Hangul proclamation day

## Description
This plugin is for Hangul proclamation day. <br/>
It is a plugin that makes the player leave the server when he/she claimed all required item and created the final item.

## How To Play
### How to set up the server
1. Download the plugin from [here](https://github.com/igomq/hantoleave/releases/latest)
2. Download Java Runtime (Java 17 or later is required)
3. Download the Minecraft Server Core (Spigot / Paper 1.18 or later is required)
4. Start the Minecraft server
5. Put the plugin in the created plugin folder
6. Re-start the Minecraft server ( **NOT A RELOAD** )
7. Enjoy!

( To enjoy the plugin, you can also use the Real-Time Plugin )

### Play Rules 
#### - How to create Gat-Cha Item
![image](https://user-images.githubusercontent.com/48321102/194753614-305f39bd-14f1-47e4-ad75-78329bfa3cf1.png)
<br/> Create the Gat-Cha Item by putting the required items in the crafting table. <br/>
The required items are as follows. <br/>
You can use this item by right-clicking the item in your inventory (You should open the inventory!)

Probability of the Gat-Cha Item <br/>
<table>
    <th>Item</th>
    <th>Probability</th>
    <tr>
        <td>Fail</td>
        <td>80%</td>
    </tr>
    <tr>
        <td>Item [ㅎ]</td>
        <td>10%</td>
    </tr>
    <tr>
        <td>Item [ㅏ]</td>
        <td>7%</td>
    </tr>
    <tr>
        <td>Item [ㄴ]</td>
        <td>3%</td>
    </tr>
</table>
<br/>

#### - How to create the final item
![image](https://user-images.githubusercontent.com/48321102/194753716-a88e93f3-dbcd-454a-a483-1314a13d76bf.png)
<br/> Create the final item by putting the required items in the crafting table. <br/>
The required items are as follows. <br/>
**Those red, blue, white banners are came from the Gat-Cha Item.** <br/>
You can use this item by right-clicking the item in your inventory (You should open the inventory!)
<br/><br/>
#### - How to play after you created the final item
![image](https://user-images.githubusercontent.com/48321102/194753768-31f7e479-adf6-4cb5-b9c1-8a5bfc2b7edf.png)
<br/> After you created the final item, you can use the item by right-clicking the item in your inventory (You should open the inventory!) <br/>
Then, you will be kicked from the server. <br/>
You can rejoin to the server and spectate the game! <br/>
## How To Build The Plugin (For Developers)
1. Clone this repository
2. Add your Minecraft Library on your Local Maven Repository and change build.gradle to use your library. 
3. Run `./gradlew build` in the root directory 
4. You can find the jar file in `build/libs` directory