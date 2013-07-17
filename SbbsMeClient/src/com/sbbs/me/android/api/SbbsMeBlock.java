package com.sbbs.me.android.api;

import java.io.Serializable;

import org.json.JSONObject;

public class SbbsMeBlock implements Serializable {

	private static final long serialVersionUID = -1669187137504440771L;

	public String AuthorId;
	public String Body;
	public String Created_on;
	public String Format;
	public String Id;
	public double Order;
	public String ParentId;
	public int Public;
	public int RightBlockCount;
	public String Status;
	public String Subject;
	public String Type;
	public String Updated_on;
	public String _id;

	public static SbbsMeBlock fromJson(JSONObject json) throws Exception {
		SbbsMeBlock block = new SbbsMeBlock();

		block.AuthorId = json.getString("AuthorId");
		block.Body = json.getString("Body");
		block.Created_on = json.getString("Created_on");
		block.Format = json.getString("Format");
		block.Id = json.getString("Id");
		block.Order = json.getDouble("Order");
		block.ParentId = json.getString("ParentId");
		try {
			block.Public = json.getInt("Public");
		} catch (Exception e) {
			block.Public = 1;
		}
		block.RightBlockCount = json.getInt("RightBlockCount");
		block.Status = json.getString("Status");
		block.Subject = json.getString("Subject");
		block.Type = json.getString("Type");
		block.Updated_on = json.getString("Updated_on");
		block._id = json.getString("_id");
		return block;
	}
}
