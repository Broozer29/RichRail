package parser;
import java.util.ArrayList;

// Generated from RichRail.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

import domain.Train;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RichRailParser}.
 */
public interface RichRailListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RichRailParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(RichRailParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(RichRailParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newcommand}.
	 * @param ctx the parse tree
	 */
	void enterNewcommand(RichRailParser.NewcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newcommand}.
	 * @param ctx the parse tree
	 */
	void exitNewcommand(RichRailParser.NewcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newtraincommand}.
	 * @param ctx the parse tree
	 */
	void enterNewtraincommand(RichRailParser.NewtraincommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newtraincommand}.
	 * @param ctx the parse tree
	 */
	void exitNewtraincommand(RichRailParser.NewtraincommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newwagononecommand}.
	 * @param ctx the parse tree
	 */
	void enterNewwagononecommand(RichRailParser.NewwagononecommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newwagononecommand}.
	 * @param ctx the parse tree
	 */
	void exitNewwagononecommand(RichRailParser.NewwagononecommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newwagontwocommand}.
	 * @param ctx the parse tree
	 */
	void enterNewwagontwocommand(RichRailParser.NewwagontwocommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newwagontwocommand}.
	 * @param ctx the parse tree
	 */
	void exitNewwagontwocommand(RichRailParser.NewwagontwocommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newwagonthreecommand}.
	 * @param ctx the parse tree
	 */
	void enterNewwagonthreecommand(RichRailParser.NewwagonthreecommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newwagonthreecommand}.
	 * @param ctx the parse tree
	 */
	void exitNewwagonthreecommand(RichRailParser.NewwagonthreecommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#newlocomotivecommand}.
	 * @param ctx the parse tree
	 */
	void enterNewlocomotivecommand(RichRailParser.NewlocomotivecommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#newlocomotivecommand}.
	 * @param ctx the parse tree
	 */
	void exitNewlocomotivecommand(RichRailParser.NewlocomotivecommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#addcommand}.
	 * @param ctx the parse tree
	 */
	void enterAddcommand(RichRailParser.AddcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#addcommand}.
	 * @param ctx the parse tree
	 */
	void exitAddcommand(RichRailParser.AddcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#getcommand}.
	 * @param ctx the parse tree
	 */
	void enterGetcommand(RichRailParser.GetcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#getcommand}.
	 * @param ctx the parse tree
	 */
	void exitGetcommand(RichRailParser.GetcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#delcommand}.
	 * @param ctx the parse tree
	 */
	void enterDelcommand(RichRailParser.DelcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#delcommand}.
	 * @param ctx the parse tree
	 */
	void exitDelcommand(RichRailParser.DelcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#remcommand}.
	 * @param ctx the parse tree
	 */
	void enterRemcommand(RichRailParser.RemcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#remcommand}.
	 * @param ctx the parse tree
	 */
	void exitRemcommand(RichRailParser.RemcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RichRailParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RichRailParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RichRailParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RichRailParser.TypeContext ctx);
	String getLastAction();
	Train getCurrentTrain();
	ArrayList<Train> getTrainList();
}